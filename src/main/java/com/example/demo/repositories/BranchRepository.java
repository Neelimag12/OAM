package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Branch;

public interface BranchRepository extends CrudRepository<Branch, Integer> {

}
