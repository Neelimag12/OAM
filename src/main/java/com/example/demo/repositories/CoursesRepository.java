package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Courses;

public interface CoursesRepository extends CrudRepository<Courses, Integer> {

}
