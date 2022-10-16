package com.example.RetoDisfraces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoDisfraces.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
