package com.taskmanager.taskmanager_backend.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
  private UUID uuid;
  private String fullName;
  private String email;
  private LocalDateTime createdAt;
}
