package com.example.type;

import java.util.UUID;

public class Register {

	private final String username;
	private final UUID userId;
	private final String pass;

	public Register(String id, String pass, UUID uID) {
		this.username = id;
		this.pass = pass;
		this.userId = uID;
	
	}

	public UUID getuserId(){
		return userId;
	}

	public String getRegisterId() {
		return username;
	}

	public String getpass() {
		return pass;
	}
}

