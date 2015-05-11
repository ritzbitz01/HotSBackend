package com.rbp.hotsbackend.dao.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.rbp.hotsbackend.dao.BuildDao;
import com.rbp.hotsbackend.dao.models.Build;

@Repository
public class CassandraBuildDao implements BuildDao {

	private final CassandraOperations cassandraTemplate;

	@Autowired
	CassandraBuildDao(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}

	@Override
	public List<Build> getAllBuilds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Build saveBuild(String heroId, Build build) {
		build.getBuildKey().setHeroId(heroId);
		cassandraTemplate.insert(build);
		return null;
	}

	@Override
	public Build getBuild(String heroId) {
		// TODO Auto-generated method stub
		return null;
	}

}
