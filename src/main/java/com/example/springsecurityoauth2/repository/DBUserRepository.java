package com.example.springsecurityoauth2.repository;

import com.example.springsecurityoauth2.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
    public DBUser findByUsername(String username);
}
