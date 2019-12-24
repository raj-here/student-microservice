package tech.raj.students.bean;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BaseBean {
	private Date createdDate;
	private Date updateDate;

	public BaseBean(Date createdDate, Date updateDate) {
		super();
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}
}
