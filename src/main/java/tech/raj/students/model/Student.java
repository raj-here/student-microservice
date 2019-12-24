package tech.raj.students.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.students.bean.StudentBean;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends BaseModel {

	@Column(name = "student_roll_no", unique= true)
	@NotNull
	private int rollNo;

	@Column(name = "student_name")
	@NotNull
	@Size(max = 100)
	private String name;

	@Column(name = "age")
	private int age;

	public Student(StudentBean studentBean) {
		super();
		this.id = studentBean.getId();
		this.rollNo = studentBean.getRollNo();
		this.name = studentBean.getName();
		this.age = studentBean.getAge();
	}
}
