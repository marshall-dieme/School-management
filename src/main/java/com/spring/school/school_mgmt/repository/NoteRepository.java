package com.spring.school.school_mgmt.repository;

import com.spring.school.school_mgmt.model.TypeNote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<TypeNote, Integer> {
    
}