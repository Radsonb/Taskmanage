package com.taskmanager.taskmanager_backend.dto;

import java.util.UUID;

public record LoginResponse(
        UUID uuid,
        String fullName,
        String email,
        String accessToken
) {
}
