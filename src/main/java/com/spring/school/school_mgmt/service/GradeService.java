package com.spring.school.school_mgmt.service;

import com.spring.school.school_mgmt.repository.GradeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;

    
}