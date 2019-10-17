package com.edigital.office.model.dto;

public class AuthToken {

	private String token;
	private String name;
	private String lastLoginTime;

	public AuthToken() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "AuthToken [name=" + name + ", lastLoginTime=" + lastLoginTime + "]";
	}
   
}
