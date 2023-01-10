package com.example.type;

import java.util.UUID;

public class DeleteAcc {

	private final UUID userId;

	public DeleteAcc(UUID uID) {
		this.userId = uID;
	}

	public UUID getuserId(){
		return userId;
	}

}
