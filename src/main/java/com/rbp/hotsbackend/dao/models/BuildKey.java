package com.rbp.hotsbackend.dao.models;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class BuildKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8892153103103202326L;

	@PrimaryKeyColumn(name = "heroname", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String heroname;

	@PrimaryKeyColumn(name = "buildname", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private String buildname;
	
	public BuildKey() {
		
	}
	
	public BuildKey(String heroname, String buildname) {
		this.heroname = heroname;
		this.buildname = buildname;
	}
	

	public String getHeroId() {
		return heroname;
	}

	public void setHeroId(String heroname) {
		this.heroname = heroname;
	}

	public String getBuildId() {
		return buildname;
	}

	public void setBuildId(String buildname) {
		this.buildname = buildname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildname == null) ? 0 : buildname.hashCode());
		result = prime * result + ((heroname == null) ? 0 : heroname.hashCode());
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
		BuildKey other = (BuildKey) obj;
		if (buildname == null) {
			if (other.buildname != null)
				return false;
		} else if (!buildname.equals(other.buildname))
			return false;
		if (heroname == null) {
			if (other.heroname != null)
				return false;
		} else if (!heroname.equals(other.heroname))
			return false;
		return true;
	}


}
