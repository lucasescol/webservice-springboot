package com.lucasescol.webservicespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasescol.webservicespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
