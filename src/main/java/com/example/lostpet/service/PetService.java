package com.example.lostpet.service;

import com.example.lostpet.model.Pet;
import com.example.lostpet.model.User;
import com.example.lostpet.repository.PetRepository;
import com.example.lostpet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    PetRepository repository;

    public Pet insert(Pet pet){
        return repository.save(pet);
    }
}
