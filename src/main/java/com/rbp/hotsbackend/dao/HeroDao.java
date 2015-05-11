package com.rbp.hotsbackend.dao;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.rbp.hotsbackend.dao.models.Hero;

@NoRepositoryBean
public interface HeroDao {
	public List<Hero> getAllHeroes();
	public Hero saveHero(Hero hero);
	public Hero getHero(String heroId);
	//public void addWorkout(String userId, String workoutId);

}
