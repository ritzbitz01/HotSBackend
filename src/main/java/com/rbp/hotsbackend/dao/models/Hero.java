package com.rbp.hotsbackend.dao.models;

import java.util.List;
import java.util.Map;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Hero {

	@PrimaryKey
	private String name;
	@Column
	private String nickname;
	@Column
	private String description;
	@Column
	private int damage;
	@Column
	private int utility;
	@Column
	private int survivability;
	@Column
	private int complexity;
	@Column
	private String type;
	@Column
	private String attackType;
	@Column
	private List<Ability> primaryAbilities;
	@Column
	private List<Ability> heroicAbilities;
//	@Column
//	private List<Trait> heroTraits;
	@Column
	private List<Talent> talents;	
	@Column
	private Map<String, Build> builds;
	
	public Hero() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getUtility() {
		return utility;
	}
	public void setUtility(int utility) {
		this.utility = utility;
	}
	public int getSurvivability() {
		return survivability;
	}
	public void setSurvivability(int survivability) {
		this.survivability = survivability;
	}
	public int getComplexity() {
		return complexity;
	}
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Ability> getPrimaryAbilities() {
		return primaryAbilities;
	}
	public void setPrimaryAbilities(List<Ability> primaryAbilities) {
		this.primaryAbilities = primaryAbilities;
	}
	public List<Ability> getHeroicAbilities() {
		return heroicAbilities;
	}
	public void setHeroicAbilities(List<Ability> heroicAbilities) {
		this.heroicAbilities = heroicAbilities;
	}
//	public List<Trait> getHeroTraits() {
//		return heroTraits;
//	}
//	public void setHeroTraits(List<Trait> heroTraits) {
//		this.heroTraits = heroTraits;
//	}
	public List<Talent> getTalents() {
		return talents;
	}
	public void setTalents(List<Talent> talents) {
		this.talents = talents;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}
}

