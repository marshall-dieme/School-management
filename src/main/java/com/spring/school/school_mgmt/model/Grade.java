package com.spring.school.school_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grade_tbl")
public class Grade {
    @Id
    @GeneratedValue
    private int id;

    @Column(columnDefinition = "varchar(20)" ,unique=true)
    private String code;

    private String name;
    
    @ManyToMany(targetEntity = User.class, cascade = CascadeType.ALL)
    private List<User> students;

    public Grade() {
    }

    public Grade(int id, String code, String name, List<User> students) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.students = students;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getStudents() {
        return this.students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Grade)) {
            return false;
        }
        Grade grade = (Grade) o;
        return id == grade.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, students);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", students='" + getStudents() + "'" +
            "}";
    }

}