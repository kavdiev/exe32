package com.example.exep32.repositories;

import com.example.exep32.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long userId);

    //  add search by email
}
