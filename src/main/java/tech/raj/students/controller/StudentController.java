package tech.raj.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tech.raj.students.bean.OutputBean;
import tech.raj.students.bean.StudentBean;
import tech.raj.students.service.StudentService;

@RestController
@RequestMapping(value = "/student")
@Api(value="StudentController")
public class StudentController {

	@Autowired
	StudentService studentService;

	@ApiOperation(value = "Get list of students")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public OutputBean<List<StudentBean>> getStudents() {
		return new OutputBean<>("data", studentService.getAll());
	}

	@ApiOperation(value = "Get student by id")
	@RequestMapping(path = "/{studentId}", method = RequestMethod.GET)
	public OutputBean<StudentBean> getStudent(@PathVariable("studentId") String studentId) {
		return new OutputBean<>("data", studentService.findById(studentId));
	}

	@ApiOperation(value = "save a student")
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public void saveStudent(@RequestBody StudentBean student) {
		studentService.save(student);
	}

}
