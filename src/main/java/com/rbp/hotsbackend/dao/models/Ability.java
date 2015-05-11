package com.rbp.hotsbackend.dao.models;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Ability {
	
	@PrimaryKey
	private AbilityKey abilityKey;
	
	@Column
	private String description;
	
	@Column
	private String hotKey;
	
	@Column
	private String abilityType;
	
	public Ability() {
		
	}
	
	public Ability(String heroName, String abilityName, String description, String hotKey, String abilityType) {
		this.abilityKey.setHeroId(heroName);
		this.abilityKey.setAbilityId(abilityName);
		this.description = description;
		this.hotKey = hotKey;
		this.abilityType = abilityType;
	}

	public AbilityKey getAbilityKey() {
		return abilityKey;
	}

	public void setAbilityKey(AbilityKey abilityKey) {
		this.abilityKey = abilityKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotKey() {
		return hotKey;
	}

	public void setHotKey(String hotKey) {
		this.hotKey = hotKey;
	}

	public String getAbilityType() {
		return abilityType;
	}

	public void setAbilityType(String abilityType) {
		this.abilityType = abilityType;
	}
}
