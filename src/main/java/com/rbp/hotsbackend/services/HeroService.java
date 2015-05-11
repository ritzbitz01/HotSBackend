package com.rbp.hotsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.hotsbackend.dao.HeroDao;
import com.rbp.hotsbackend.dao.models.Hero;

@Service
public class HeroService {
	
	@Autowired
	HeroDao heroDao;
	
	public Hero saveHero(Hero hero) {
		
		// Get the abilities
		
		return heroDao.saveHero(hero);
		
	}
	
	public Hero getHero(String heroName) {
		return heroDao.getHero(heroName);
	}

}
