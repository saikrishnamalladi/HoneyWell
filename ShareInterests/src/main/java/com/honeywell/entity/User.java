package com.honeywell.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedQuery(name = "User.fetchByLocation",
        query = "SELECT u FROM User u WHERE u.longitude between :longitude-1000 and :longitude+1000"
        		+ "and u.latitude between :latitude-1000 and :latitude+1000"
)
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2461315645090990075L;

	@Id
	@Column(name = "user_id",unique=true,nullable=false)
	private String userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "longitude")
	private int longitude;
	
	@Column(name = "latitude")
	private int latitude;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

}
