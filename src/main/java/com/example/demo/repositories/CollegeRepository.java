package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.College;

public interface CollegeRepository extends CrudRepository<College, Integer>{

}
