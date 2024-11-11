package com.example.CRUD_APPLICATION;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    //CRUD

    Optional<Student> findById(long id);

    void deleteById(long id);

    void saveAll(Student existingStudent);
} 
