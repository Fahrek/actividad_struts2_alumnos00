package org.demo.actions;

import lombok.*;
import org.demo.actions.beans.Student;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RegisterAction extends ActionSupport {

	// Setter methods
	private List<Student> students;
	private Student studentBean;

	@Override
	public String execute() {
		StudentService service = new StudentService();
		service.saveStudent(studentBean);
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (studentBean == null) {
			addFieldError("studentBean.dni", "El DNI es obligatorio.");
		}
		if (studentBean.getFirstName().isEmpty()) {
			addFieldError("studentBean.firstName", "El nombre es obligatorio.");
		}
		if (studentBean.getLastName().isEmpty()) {
			addFieldError("studentBean.lastName", "El apellido es obligatorio.");
		}
		if (studentBean.getEmail().isEmpty()) {
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
