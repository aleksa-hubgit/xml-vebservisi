package com.example.login.controller;


import com.example.login.dto.LoginDTO;
import com.example.login.dto.RegisterDTO;
import com.example.login.model.User;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="auth")
public class AuthController {

    @Autowired
    public UserService userService;


    @PostMapping(value="login", consumes = "application/xml")
    public ResponseEntity<User> login(@RequestBody LoginDTO loginDTO){
        User user = userService.login(loginDTO);


        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value="register", consumes = "application/xml")
    public void register(@RequestBody RegisterDTO user){
        userService.register(user);
    }


}
