package com.example.exep32.repositories;

import com.example.exep32.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //  add search by email
}
