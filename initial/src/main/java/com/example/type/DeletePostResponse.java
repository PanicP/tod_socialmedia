package com.example.type;

import java.util.UUID;

public class DeletePostResponse {
    private final UUID userId;

    public DeletePostResponse(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }
}
