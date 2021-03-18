package com.sophos.backbasetestautomated.register.models;

public class UserRegistrationData {

	private String userName;
	private String email;
	private String password;
	
	public UserRegistrationData(String userName) {
		this(userName, "", "");
	}

	public UserRegistrationData() {
		this("", "", "");
	}

	public UserRegistrationData(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
