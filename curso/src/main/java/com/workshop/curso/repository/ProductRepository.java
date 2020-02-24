package com.workshop.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
