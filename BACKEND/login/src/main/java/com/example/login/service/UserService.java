package com.example.login.service;

import com.example.login.dto.LoginDTO;
import com.example.login.dto.RegisterDTO;
import com.example.login.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {



    private List<User> users;

    public UserService(){
        this.users = new ArrayList<>();
        this.users.add(new User("Stefan", "Milosevic", "stefan.milosevic.e14@gmail.com","perica","KORISNIK"));
        this.users.add(new User("Bubi", "Bubisa", "bubibubisa@gmail.com","bubisa","ADMIN"));


    }
    public User login(LoginDTO loginDTO) {

        for (User user : users) {
            if (user.getEmail().equals(loginDTO.email) && user.getPassword().equals(loginDTO.password)) {
                return user;
            }
        }
        return null;

    }


    public void register(RegisterDTO registerDTO){
        User user = new User(registerDTO.name, registerDTO.surname, registerDTO.email, registerDTO.password, "KORISNIK");
        this.users.add(user);
    }

}
