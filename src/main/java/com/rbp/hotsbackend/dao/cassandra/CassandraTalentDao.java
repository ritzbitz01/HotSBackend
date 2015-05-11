package com.rbp.hotsbackend.dao.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.rbp.hotsbackend.dao.TalentDao;
import com.rbp.hotsbackend.dao.models.Talent;

@Repository
public class CassandraTalentDao implements TalentDao {

	private final CassandraOperations cassandraTemplate;

	@Autowired
	CassandraTalentDao
	(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}

	public Talent saveTalent(Talent talent) {
		return null;
	}

	@Override
	public Talent getTalent(String talentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
