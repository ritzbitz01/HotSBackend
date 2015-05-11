package com.rbp.hotsbackend.dao.models;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.rbp.hotsbackend.controller.BuildRequestObject;

@Table
public class Build {
	
	@PrimaryKey
	private BuildKey buildKey;
	
	@Column
	private String level1talent;
	@Column
	private String level4talent;
	@Column
	private String level7talent;
	@Column
	private String level10talent;
	@Column
	private String level13talent;
	@Column
	private String level16talent;
	@Column
	private String level20talent;
	
	public Build() {
		
	}
	
	public Build(BuildRequestObject bro) {
		this.buildKey = new BuildKey(bro.getHeroname(), bro.getBuildname());
		this.level1talent = bro.getLevel1talent();
		this.level4talent = bro.getLevel4talent();
		this.level7talent = bro.getLevel7talent();
		this.level10talent = bro.getLevel10talent();
		this.level13talent= bro.getLevel13talent();
		this.level16talent = bro.getLevel16talent();
		this.level20talent = bro.getLevel20talent();
	}

	public BuildKey getBuildKey() {
		return buildKey;
	}

	public void setBuildKey(BuildKey buildKey) {
		this.buildKey = buildKey;
	}


	public String getLevel1Talent() {
		return level1talent;
	}

	public void setLevel1Talent(String level1Talent) {
		this.level1talent = level1Talent;
	}

	public String getLevel4Talent() {
		return level4talent;
	}

	public void setLevel4Talent(String level4Talent) {
		this.level4talent = level4Talent;
	}

	public String getLevel7Talent() {
		return level7talent;
	}

	public void setLevel7Talent(String level7Talent) {
		this.level7talent = level7Talent;
	}

	public String getLevel10Talent() {
		return level10talent;
	}

	public void setLevel10Talent(String level10Talent) {
		this.level10talent = level10Talent;
	}

	public String getLevel13Talent() {
		return level13talent;
	}

	public void setLevel13Talent(String level13Talent) {
		this.level13talent = level13Talent;
	}

	public String getLevel16Talent() {
		return level16talent;
	}

	public void setLevel16Talent(String level16Talent) {
		this.level16talent = level16Talent;
	}

	public String getLevel20Talent() {
		return level20talent;
	}

	public void setLevel20Talent(String level20Talent) {
		this.level20talent = level20Talent;
	}

}
