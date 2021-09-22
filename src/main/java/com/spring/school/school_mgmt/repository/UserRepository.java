package com.spring.school.school_mgmt.repository;

import com.spring.school.school_mgmt.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}