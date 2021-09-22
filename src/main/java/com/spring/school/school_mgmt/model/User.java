package com.spring.school.school_mgmt.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "varchar(20)" , unique = true)
    private String code;

    private String fistName;

    private String lastName;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToOne(targetEntity = Module.class, cascade = CascadeType.ALL)
    private Module module;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @ManyToMany(targetEntity = Grade.class, cascade = CascadeType.ALL)
    private List<Grade> grades;

    @OneToMany(targetEntity = Note.class, mappedBy = "student", cascade = CascadeType.ALL)
    private List<Note> notes;

    @ManyToOne(targetEntity = TypeUser.class, cascade = CascadeType.ALL)
    private TypeUser typeUser;

    public User() {
    }

    public User(String fistName, String lastName, Date birthDate, List<Grade> grades, List<Note> notes, TypeUser typeUser) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
        this.notes = notes;
        this.typeUser = typeUser;
    }


    public User(String fistName, String lastName, Module module, TypeUser typeUser) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.module = module;
        this.typeUser = typeUser;
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

    public String getFistName() {
        return this.fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Grade> getGrades() {
        return this.grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public User id(int id) {
        setId(id);
        return this;
    }

    public User code(String code) {
        setCode(code);
        return this;
    }

    public User fistName(String fistName) {
        setFistName(fistName);
        return this;
    }

    public User lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public User module(Module module) {
        setModule(module);
        return this;
    }

    public User birthDate(Date birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    public User grades(List<Grade> grades) {
        setGrades(grades);
        return this;
    }

    public User notes(List<Note> notes) {
        setNotes(notes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, fistName, lastName, module, birthDate, grades, notes);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", code='" + getCode() + "'" +
            ", fistName='" + getFistName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", module='" + getModule() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", grades='" + getGrades() + "'" +
            ", notes='" + getNotes() + "'" +
            "}";
    }

    /**
     * @return TypeUser return the typeUser
     */
    public TypeUser getTypeUser() {
        return typeUser;
    }

    /**
     * @param typeUser the typeUser to set
     */
    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }


    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}