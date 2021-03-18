package com.sophos.backbasetestautomated.register.models;

public class UserAccessAplication {
	private String user;
	private String password;

	public UserAccessAplication() {
		this("default", "default");
	}

	public UserAccessAplication(final String user, final String password) {
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

}
