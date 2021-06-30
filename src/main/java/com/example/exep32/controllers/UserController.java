package com.example.exep32.controllers;

import com.example.exep32.model.User;
import com.example.exep32.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository  userRepository;


    @GetMapping ("/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping ("/users/{userId}")
    public User getUserById(@PathParam( value ="userId") Long userId) {
        return userRepository.findUserById(userId);
    }

    @PostMapping("/users")
    public  User  addUser (@RequestBody  User user) {
        return  userRepository.save(user);
    }
}
