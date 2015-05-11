package com.rbp.hotsbackend.dao;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.rbp.hotsbackend.dao.models.Ability;

@NoRepositoryBean
public interface AbilityDao {
	
	public List<Ability> getAbilitiesForHero(String heroName);

}
