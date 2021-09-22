package com.spring.school.school_mgmt.service;

import com.spring.school.school_mgmt.repository.ModuleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    @Autowired
    ModuleRepository moduleRepository;
}