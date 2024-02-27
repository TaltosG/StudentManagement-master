package com.takacs.StudentManagement.repository;

import com.takacs.StudentManagement.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
