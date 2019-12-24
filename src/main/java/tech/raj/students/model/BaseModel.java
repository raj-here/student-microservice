package tech.raj.students.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public class BaseModel {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	protected String id;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "updat_date")
	private Date updateDate;

	@PrePersist
	protected void onCreate() {
		createdDate = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updateDate = new Date();
	}
}
