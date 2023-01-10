package com.example.type;

public class Login {

	private final String loginId;
	private final String loginPass;

	public Login(String id, String pass) {
		this.loginId = id;
		this.loginPass = pass;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getpass() {
		return loginPass;
	}
}

