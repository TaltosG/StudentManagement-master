package com.takacs.StudentManagement.service;

import com.takacs.StudentManagement.entity.Student;
import java.util.List;

public interface StudentService {
   List<Student> getAllStudents();

   Student saveStudent(Student student);

   static Student getStudentById(Long is) {
      return null;
   }

   static Student updateStudent(Student student) {
      return null;
   }

}
