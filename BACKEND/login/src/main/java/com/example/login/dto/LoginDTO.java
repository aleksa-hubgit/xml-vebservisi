package com.example.login.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "login")
public class LoginDTO {

    public String email;
    public String password;

}
