package com.rbp.hotsbackend.dao.models;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class AbilityKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8892153103103202326L;

	@PrimaryKeyColumn(name = "hero_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String heroId;

	@PrimaryKeyColumn(name = "ability_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private String abilityId;

	public String getHeroId() {
		return heroId;
	}

	public void setHeroId(String heroId) {
		this.heroId = heroId;
	}

	public String getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(String buildId) {
		this.abilityId = buildId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abilityId == null) ? 0 : abilityId.hashCode());
		result = prime * result + ((heroId == null) ? 0 : heroId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbilityKey other = (AbilityKey) obj;
		if (abilityId == null) {
			if (other.abilityId != null)
				return false;
		} else if (!abilityId.equals(other.abilityId))
			return false;
		if (heroId == null) {
			if (other.heroId != null)
				return false;
		} else if (!heroId.equals(other.heroId))
			return false;
		return true;
	}
}
