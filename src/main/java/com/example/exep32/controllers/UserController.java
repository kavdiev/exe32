package com.example.exep32.controllers;

import com.example.exep32.model.User;
import com.example.exep32.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository  userRepository;


    @GetMapping ("/users")
    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
    @PostMapping("/users")
    public  User  addUser (@RequestBody  User user) {
        return  userRepository.save(user);
    }
}
