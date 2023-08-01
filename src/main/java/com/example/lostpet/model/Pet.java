package com.example.lostpet.model;

import com.example.lostpet.enums.Carry;
import com.example.lostpet.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue
    private UUID id;

    //private String photo;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String race;

    private Date birth;

    @Column(length = 40, nullable = false, unique = true)
    private String collarCode;

    @Enumerated(EnumType.STRING)
    @Column(length = 6)
    private Carry carry;

    @Enumerated(EnumType.STRING)
    @Column(length = 6)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Boolean castrated;

}
