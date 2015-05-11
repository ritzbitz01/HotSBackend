package com.rbp.hotsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbp.hotsbackend.dao.TalentDao;
import com.rbp.hotsbackend.dao.models.Talent;

@Service
public class TalentService {

	@Autowired
	TalentDao talentDao;

	public Talent saveTalent(Talent talent) {
		return talentDao.saveTalent(talent);
		
	}
}
