package tech.raj.students.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.raj.students.bean.StudentBean;
import tech.raj.students.dao.StudentDao;
import tech.raj.students.model.Student;
import tech.raj.students.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void save(StudentBean studentBean) {
		studentDao.save(new Student(studentBean));
	}

	@Override
	public List<StudentBean> getAll() {
		return studentDao.getAll().stream().map(StudentBean::new).collect(Collectors.toList());
	}

	@Override
	public StudentBean findById(String id) {
		return new StudentBean(studentDao.findById(id));
	}
}
