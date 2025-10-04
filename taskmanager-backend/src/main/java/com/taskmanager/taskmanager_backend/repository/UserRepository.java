package com.taskmanager.taskmanager_backend.repository;

import com.taskmanager.taskmanager_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUuid(UUID uuid);
  Optional<User> findByEmail(String email);
  boolean existsByEmail(String email);
}
