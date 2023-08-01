package com.example.lostpet.controller;

import com.example.lostpet.model.Pet;
import com.example.lostpet.model.User;
import com.example.lostpet.service.PetService;
import com.example.lostpet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController()
@RequestMapping(value = "pet")
public class PetControll {

    @Autowired
    PetService service;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Pet pet){
        pet = service.insert(pet);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(pet.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
