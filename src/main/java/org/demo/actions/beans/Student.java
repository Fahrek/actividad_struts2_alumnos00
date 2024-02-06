package org.demo.actions.beans;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private String dni;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String country;
	private String postalCode;
	private Date birthDate;
	private Date startDate;
	private Date endDate;

	public Student() {}

	public Student(String dni, String firstName, String lastName, String email, String phone, String address, String city, String country, String postalCode, Date birthDate, Date startDate, Date endDate) {
		this.dni = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "student{" +
				"dni='" + dni + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", postalCode='" + postalCode + '\'' +
				", birthDate=" + birthDate +
				", startDate=" + startDate +
				", endDate=" + endDate +
				'}';
	}
}
