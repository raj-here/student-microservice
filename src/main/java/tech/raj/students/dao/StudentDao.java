package tech.raj.students.dao;

import java.util.List;

import tech.raj.students.model.Student;

public interface StudentDao {

	void save(Student student);

	List<Student> getAll();

	Student findById(String id);
}
