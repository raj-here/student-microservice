package tech.raj.students.service;

import java.util.List;

import tech.raj.students.bean.StudentBean;

public interface StudentService {

	void save(StudentBean student);

	List<StudentBean> getAll();

	StudentBean findById(String id);

}
