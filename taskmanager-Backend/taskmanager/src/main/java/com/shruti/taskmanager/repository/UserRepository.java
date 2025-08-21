package com.shruti.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.taskmanager.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
