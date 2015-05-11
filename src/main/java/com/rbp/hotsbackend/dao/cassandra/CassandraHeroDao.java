package com.rbp.hotsbackend.dao.cassandra;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.rbp.hotsbackend.dao.HeroDao;
import com.rbp.hotsbackend.dao.models.Hero;

@Repository
public class CassandraHeroDao implements HeroDao, InitializingBean {

	private final CassandraOperations cassandraTemplate;
	
	private PreparedStatement getAbilitiesForHeroStmt;

	@Autowired
	CassandraHeroDao(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		getAbilitiesForHeroStmt = cassandraTemplate.getSession().prepare("SELECT * from ability where heroid = ?;");
	}
	@Override
	public List<Hero> getAllHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hero saveHero(Hero hero) {
		cassandraTemplate.insert(hero);
		return hero;
	}

	@Override
	public Hero getHero(String heroId) {
		Select select = QueryBuilder.select().from("hero");
		select.where(QueryBuilder.eq("name", heroId));

		Hero hero = cassandraTemplate.selectOne(select, Hero.class);
		
		// Get Talents
		
		// Get Abilities
		
		// Get Builds
		
		return hero;
	}



}
