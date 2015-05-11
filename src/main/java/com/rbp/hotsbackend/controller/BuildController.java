package com.rbp.hotsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.hotsbackend.dao.BuildDao;
import com.rbp.hotsbackend.dao.models.Build;

@RestController
@RequestMapping("/heros/{heroName}/builds")
public class BuildController {
	
	@Autowired
	BuildDao buildDao;

	@RequestMapping(method=RequestMethod.POST)
	public Build saveBuild(@RequestBody BuildRequestObject buildRequest, @PathVariable String heroName) {
		System.out.println("HERO NAME: " + heroName);
		Build newBuild = new Build(buildRequest);
		Build build = buildDao.saveBuild(heroName, newBuild);
		return build;
	}
	
	@RequestMapping(value="/{buildName}", method=RequestMethod.GET)
	public Build getBuild(@PathVariable String heroName, @PathVariable String buildName) {
		Build build = buildDao.getBuild(heroName);
		return build;
	}

}
