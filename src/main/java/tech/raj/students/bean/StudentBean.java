package tech.raj.students.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.students.model.Student;

@Getter
@Setter
@NoArgsConstructor
public class StudentBean extends BaseBean {

	private String id;

	@NotNull
	private int rollNo;

	@NotNull
	@Size(max = 100)
	private String name;

	private int age;

	public StudentBean(Student student) {
//		super(student.getCreatedDate(), student.getUpdateDate());
		this.id = student.getId();
		this.rollNo = student.getRollNo();
		this.name = student.getName();
		this.age = student.getAge();
	}
}
