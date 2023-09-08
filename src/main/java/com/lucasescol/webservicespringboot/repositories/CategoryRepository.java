package com.lucasescol.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasescol.webservicespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}

