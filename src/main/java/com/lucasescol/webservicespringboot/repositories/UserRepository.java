package com.lucasescol.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasescol.webservicespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
