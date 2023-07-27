package com.example.lostpet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 40,nullable = false)
    private String name;

    @Column(length = 254, unique = true,nullable = false)
    private String email;

    @Column(length = 128,nullable = false)
    private String password;

}
