package com.spring.school.school_mgmt.service;

import java.util.List;
import java.util.Optional;

import com.spring.school.school_mgmt.model.TypeNote;
import com.spring.school.school_mgmt.repository.TypeNoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeNoteService {
    @Autowired
    TypeNoteRepository typeNoteRepository;

    public List<TypeNote> getAll(){
        return typeNoteRepository.findAll();
    }

    public Optional<TypeNote> getOneById(int id){
        return typeNoteRepository.findById(id);
    }

    public TypeNote addTypeNote(TypeNote typeNote) {
        return typeNoteRepository.save(typeNote);
    }
}