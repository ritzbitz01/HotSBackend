package com.rbp.hotsbackend.dao;

import org.springframework.data.repository.NoRepositoryBean;

import com.rbp.hotsbackend.dao.models.Talent;

@NoRepositoryBean
public interface TalentDao {
	
	public Talent saveTalent(Talent talent);
	public Talent getTalent(String talentName);

}
