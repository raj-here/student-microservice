package tech.raj.students.bean;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OutputBean<T> {
	@NonNull
	@NotBlank
	private String message;
	private T record;

	public OutputBean(String message) {
		super();
		this.message = message;
	}

	public OutputBean(String message, T record) {
		super();
		this.message = message;
		this.record = record;
	}
}
