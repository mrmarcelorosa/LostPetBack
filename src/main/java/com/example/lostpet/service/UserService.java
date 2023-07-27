package com.example.lostpet.service;

import com.example.lostpet.model.User;
import com.example.lostpet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User insert(User user){
        return repository.save(user);
    }

}
