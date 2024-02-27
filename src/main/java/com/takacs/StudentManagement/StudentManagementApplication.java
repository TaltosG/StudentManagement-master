package com.takacs.StudentManagement;

import com.takacs.StudentManagement.entity.Student;
import com.takacs.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudentManagementApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Student student1 = new Student(null, "Lajos", "Mizse", "lajos@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student(null, "Áron", "Balázs", "aron@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student(null, "Angi", "Forgaci", "angi@gmail.com");
		studentRepository.save(student3);
		*/

	}
}