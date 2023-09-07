package com.lucasescol.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasescol.webservicespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
