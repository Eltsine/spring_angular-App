package com.example.boris.demo.repository;

import com.example.boris.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername (String username);
}
