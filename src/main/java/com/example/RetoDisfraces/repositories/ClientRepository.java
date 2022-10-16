package com.example.RetoDisfraces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoDisfraces.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
