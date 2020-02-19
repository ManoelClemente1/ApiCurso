package com.workshop.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
