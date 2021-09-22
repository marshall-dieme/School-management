package com.spring.school.school_mgmt;

import com.spring.school.school_mgmt.model.TypeNote;
import com.spring.school.school_mgmt.repository.TypeNoteRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolMgmtApplication {

	private static final Logger log = LoggerFactory.getLogger(SchoolMgmtApplication.class);
	private String typeNote;

	public static void main(String[] args) {
		SpringApplication.run(SchoolMgmtApplication.class, args);
	}

}
