package com.rbp.hotsbackend.dao;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.rbp.hotsbackend.dao.models.Build;

@NoRepositoryBean
public interface BuildDao {
	public List<Build> getAllBuilds();
	public Build saveBuild(String heroId, Build build);
	public Build getBuild(String heroId);
}
