package com.lucasescol.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasescol.webservicespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
