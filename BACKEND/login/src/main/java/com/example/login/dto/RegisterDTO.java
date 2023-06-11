package com.example.login.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "register")
public class RegisterDTO {

    public String name;
    public String surname;
    public String email;
    public String password;
    public String role;

}
