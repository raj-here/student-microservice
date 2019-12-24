package tech.raj.students.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.raj.students.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	Optional<Student> findById(String id);
}
