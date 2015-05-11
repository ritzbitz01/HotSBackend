package com.rbp.hotsbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.hotsbackend.services.TalentService;

@RestController
@RequestMapping("/talents")
public class TalentController {

	private static final Logger logger = LoggerFactory.getLogger(TalentController.class);

	@Autowired
	TalentService heroSvc;

}
