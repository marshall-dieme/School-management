package com.spring.school.school_mgmt.controller;

import java.util.List;

import com.spring.school.school_mgmt.model.TypeNote;
import com.spring.school.school_mgmt.service.TypeNoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/typeNote")
public class TypeNoteController {
    
    @Autowired
    TypeNoteService typeNoteService;

    @GetMapping("/find/{id}")
    public TypeNote findNote(@PathVariable int id){
        return typeNoteService.getOneById(id).orElse(null);
    }

    @GetMapping("/find")
    public List<TypeNote> findAll(){
        return typeNoteService.getAll();
    }

    @PostMapping("/add")
    public TypeNote addTypeNote(@RequestBody TypeNote typeNote){
        return typeNoteService.addTypeNote(typeNote);
    }
}