package com.shruti.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.taskmanager.entity.Task;
import com.shruti.taskmanager.entity.User;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
