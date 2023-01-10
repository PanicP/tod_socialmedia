package com.example.type;

public class Register {

	private final String id;
	private final String pass;

	public Register(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public String getpass() {
		return pass;
	}
}

