package com.global.hr.data.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table(name = "my_employee")
@Entity
@Data
@Builder

public class MyEmployee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;









	public MyEmployee() {

	}





	public MyEmployee(Integer id, String firstName, String lastName) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





}
