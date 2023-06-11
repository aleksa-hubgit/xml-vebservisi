package com.example.login.model;


import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "surname",
        "email",
        "password",
        "role"
})
@XmlRootElement(name="user")
public class User {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Role", required = true)
    protected String role;


    public User() {

    }

    public User(String name, String surname, String email, String password, String role) {
    	this.name = name;
    	this.surname = surname;
    	this.email = email;
    	this.password = password;
    	this.role = role;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }







}
