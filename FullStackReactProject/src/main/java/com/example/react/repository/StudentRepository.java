package com.example.react.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.react.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	List<Student> findByName(String name);
}