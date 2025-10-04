package com.taskmanager.taskmanager_backend.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CreateUserRequest {

  @NotBlank(message = "Nome completo é obrigatório")
  @Size(min = 3, max = 255, message = "Nome deve ter entre 3 e 255 caracteres")
  private String fullName;

  @NotBlank(message = "Email é obrigatório")
  @Email(message = "Email inválido")
  private String email;

  @NotBlank(message = "Senha é obrigatório")
  @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
  private String password;
}
