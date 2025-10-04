package com.taskmanager.taskmanager_backend.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserResponse(
  UUID uuid,
  String fullName,
  String email,
  LocalDateTime createdAt
) {}
