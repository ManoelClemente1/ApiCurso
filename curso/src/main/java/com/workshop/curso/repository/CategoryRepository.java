package com.workshop.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
