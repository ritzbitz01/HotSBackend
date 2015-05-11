package com.rbp.hotsbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.hotsbackend.dao.models.Hero;
import com.rbp.hotsbackend.services.HeroService;


@RestController
@RequestMapping("/heroes")
public class HeroController {
	
	private static final Logger logger = LoggerFactory.getLogger(HeroController.class);

	@Autowired
	HeroService heroSvc;

	@RequestMapping(value="/{heroName}", method = RequestMethod.GET)
	public Hero getHero(@PathVariable String heroName) {
		Hero hero = heroSvc.getHero(heroName);
		return hero;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Hero> addHero(@RequestBody Hero newHero) {
		if(newHero.getName().equals(null) || newHero.getName().equals("")) {
			return new ResponseEntity<Hero>(HttpStatus.BAD_REQUEST);
		}
		Hero hero = heroSvc.saveHero(newHero);
		return new ResponseEntity<Hero>(hero,HttpStatus.OK);
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(method = RequestMethod.GET)
//	public List<Hero> getAllHeroes() {
//		logger.info("Getting all users");
//
//		List<Hero> userList = heroDao.getAllHeroes();
//		
//
//		return userList;
//	}

}
