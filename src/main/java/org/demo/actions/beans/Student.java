package org.demo.actions.beans;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class Student implements Serializable {
	private int id;
	private int dni;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String postalCode;
	private String course;
	private Date birthDate;
	private Date startDate;
	private Date endDate;

	public Student(int id, int dni, String firstName, String lastName, String email, String phone, String address, String city, String postalCode, String course, Date birthDate, Date startDate, Date endDate) {
		this.id = id;
		this.dni = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.course = course;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Student() {

	}
}