package com.spring.school.school_mgmt.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne(targetEntity = Module.class)
    private Module module;

    private double value;

    @ManyToOne(targetEntity = TypeNote.class, cascade = CascadeType.ALL)
    private TypeNote typeNote;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    private User student;

    public Note() {
    }

    public Note(double value, Module module) {
        this.value = value;
        this.module = module;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Note module(Module module) {
        setModule(module);
        return this;
    }

    public Note value(double value) {
        setValue(value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Note)) {
            return false;
        }
        Note note = (Note) o;
        return Objects.equals(module, note.module) && value == note.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(module, value);
    }

    @Override
    public String toString() {
        return "{" +
            " module='" + getModule() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }
        

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return TypeNote return the typeNote
     */
    public TypeNote getTypeNote() {
        return typeNote;
    }

    /**
     * @param typeNote the typeNote to set
     */
    public void setTypeNote(TypeNote typeNote) {
        this.typeNote = typeNote;
    }
    
    /**
     * @return User return the student
     */
    public User getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(User student) {
        this.student = student;
    }

}