package com.workshop.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
