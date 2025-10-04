package com.taskmanager.taskmanager_backend.controller;

import com.taskmanager.taskmanager_backend.dto.CreateUserRequest;
import com.taskmanager.taskmanager_backend.dto.UserResponse;
import com.taskmanager.taskmanager_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
    UserResponse response = userService.createUser(request);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
}
