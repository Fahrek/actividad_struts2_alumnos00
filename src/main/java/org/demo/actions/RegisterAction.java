package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.Student;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RegisterAction extends ActionSupport {

	@Setter
	@Getter
	private Student studentBean;
	private final List<Student> STUDENTS = new ArrayList<>();

	public RegisterAction() {
		this.studentBean = new Student();
	}

	@Override
	public String execute() {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (studentBean == null) {
			addFieldError("studentBean.dni", "El DNI es obligatorio.");
		}
		if (studentBean.getFirstName().isEmpty() || studentBean.getFirstName() == null) {
			addFieldError("studentBean.firstName", "El nombre es obligatorio.");
		}
		if (studentBean.getLastName().isEmpty() || studentBean.getLastName() == null) {
			addFieldError("studentBean.lastName", "El apellido es obligatorio.");
		}
		if (studentBean.getEmail().isEmpty() || studentBean.getEmail() == null) {
			addFieldError("studentBean.email", "El email es obligatorio.");
		}
		if (studentBean.getBirthDate() == null) {
			addFieldError("studentBean.birthDate", "La fecha de nacimiento es obligatoria.");
		}
		if (studentBean.getStartDate() == null) {
			addFieldError("studentBean.startDate", "La fecha de inicio es obligatoria.");
		}
		if (studentBean.getEndDate() == null) {
			addFieldError("studentBean.endDate", "La fecha fin es obligatoria.");
		}
	}
}
