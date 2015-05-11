package com.rbp.hotsbackend.dao.cassandra;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;

import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.rbp.hotsbackend.dao.AbilityDao;
import com.rbp.hotsbackend.dao.models.Ability;
import com.rbp.hotsbackend.dao.models.AbilityType;
import com.rbp.hotsbackend.dao.models.HotKey;

public class CassandraAbilityDao implements AbilityDao, InitializingBean {

	private final CassandraOperations cassandraTemplate;
	
	private PreparedStatement getAbilitiesForHeroStmt;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		getAbilitiesForHeroStmt = cassandraTemplate.getSession().prepare("SELECT * from ability where heroid = ?;");
	}
	
	@Autowired
	CassandraAbilityDao(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}


	@Override
	public List<Ability> getAbilitiesForHero(String heroName) {
		ResultSet results = cassandraTemplate.getSession().execute(getAbilitiesForHeroStmt.bind(heroName));
		List<Ability> abilityList = new ArrayList<Ability>();
		for(Row r : results) {
			abilityList.add(createAbility(heroName, r.getString("name"), r.getString("description"), r.getString("hotKey"), r.getString("abilityType")));
		}
		return abilityList;
	}

	private Ability createAbility(String heroName, String name, String description, String hotKey, String abilityType) {
		return new Ability(heroName, name, description, hotKey, abilityType);
	}
}
