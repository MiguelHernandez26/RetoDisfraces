package com.example.RetoDisfraces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoDisfraces.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{
    
}
