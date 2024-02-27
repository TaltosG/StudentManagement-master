package com.takacs.StudentManagement.service;

import com.takacs.StudentManagement.entity.Student;
import java.util.List;

public interface StudentService {
   List<Student> getAllStudents();

   Student saveStudent(Student student);

  Student getStudentById(Long id);

  Student updateStudent(Student student);

}
