package com.taskmanager.taskmanager_backend.service;

import com.taskmanager.taskmanager_backend.dto.CreateUserRequest;
import com.taskmanager.taskmanager_backend.dto.UserResponse;
import com.taskmanager.taskmanager_backend.model.User;
import com.taskmanager.taskmanager_backend.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  @Transactional
  public UserResponse createUser(CreateUserRequest request) {
    if (userRepository.existsByEmail(request.getEmail())) {
      throw new RuntimeException("Email já cadastrado");
    }

    User user = new User();
    user.setFullName(request.getFullName());
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());

    User savedUser = userRepository.save(user);

    return new UserResponse(
            savedUser.getUuid(),
            savedUser.getFullName(),
            savedUser.getEmail(),
            savedUser.getCreatedAt()
    );
  }
}
