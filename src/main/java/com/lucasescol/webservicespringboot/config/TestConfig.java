package com.lucasescol.webservicespringboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasescol.webservicespringboot.entities.User;
import com.lucasescol.webservicespringboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User("Gabriel", "gabriel@gmail.com", "7588884444", "123456");
        User u2 = new User("Davi", "davi@gmail.com", "7511114444", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

    
}
