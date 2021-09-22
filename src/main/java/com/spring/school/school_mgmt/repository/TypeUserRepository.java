package com.spring.school.school_mgmt.repository;

import com.spring.school.school_mgmt.model.TypeUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeUserRepository extends JpaRepository<TypeUser, Integer> {
    
}