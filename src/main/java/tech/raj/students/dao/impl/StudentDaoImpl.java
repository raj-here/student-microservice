package tech.raj.students.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tech.raj.students.dao.StudentDao;
import tech.raj.students.model.Student;
import tech.raj.students.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(String id) {
		return studentRepository.findById(id).get();
	}

}
