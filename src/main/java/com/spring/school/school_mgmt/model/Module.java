package com.spring.school.school_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "varchar(20)" ,unique=true)
    private String name;
    
    @OneToMany(targetEntity = User.class, mappedBy = "module")
    private List<User> teachers;


    public Module() {
    }

    public Module(int id, String name, List<User> teachers) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(List<User> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Module)) {
            return false;
        }
        Module module = (Module) o;
        return id == module.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teachers);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", teachers='" + getTeachers() + "'" +
            "}";
    }

}