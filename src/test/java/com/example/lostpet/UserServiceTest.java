package com.example.lostpet;

import com.example.lostpet.model.User;
import com.example.lostpet.repository.UserRepository;
import com.example.lostpet.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    UserService service;

    @Mock
    UserRepository repository;

    User user;

    @BeforeEach
    public void setUp(){
        user = new User(null,"Marcelo","marcelo@gmail.com","1234");
    }

    @Test
    void onSaveUser() {
        //Assertions.assertEquals();
    }
}
