package com.rbp.hotsbackend.dao.models;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Talent {
	
	@PrimaryKey
	private String talentName;
	@Column
	private int tier;
	@Column
	private String type;
	@Column
	private String description;

	public Talent(int tier, String type, String description) {
		this.tier = tier;
		this.type = type;
		this.description = description;
	}
	
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
