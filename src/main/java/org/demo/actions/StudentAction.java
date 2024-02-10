package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.Student;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentAction extends ActionSupport {

	@Setter
	@Getter
	private Student studentBean;
	@Setter
	@Getter
	private String dni;
	private final List<Student> STUDENTS = new ArrayList<>();

	public StudentAction() {
		this.studentBean = new Student();
	}

	@Override
	public String execute() {
		// Si no hay estudiantes, redirige al formulario de registro
		if (STUDENTS.isEmpty()) {
			return INPUT;
		} else {
			// Si hay estudiantes, busca el estudiante con el DNI dado
			this.studentBean = new Student();
			return searchStudent();
		}
	}

	public String showStudentInfo() {
		// Verifica si el DNI está presente, redirecciona a la página de detalles del estudiante
		if (dni == null || dni.isEmpty()) {
			addActionError("El DNI es obligatorio.");
			return INPUT;
		}
		this.studentBean = new Student();
		return SUCCESS;
	}

	public String searchStudent() {
		// Busca el alumno en la lista de alumnos
		Student student = STUDENTS.stream().filter(s -> s.getDni().equals(dni)).findFirst().orElse(null);
		if (student == null) {
			addActionError("No se ha encontrado ningún alumno con el DNI " + dni);
			return INPUT;
		}
		studentBean = student;
		return SUCCESS;
	}

	public String registerStudent() {
		// Valida los datos del formulario y almacena la información en la lista de estudiantes
		if (studentBean == null) {
			addActionError("No se ha recibido ningún alumno.");
			return INPUT;
		}
		STUDENTS.add(studentBean);
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (studentBean == null) {
			addFieldError("studentBean.dni", "El DNI es obligatorio.");
		}
//		if (studentBean.getFirstName().isEmpty() || studentBean.getFirstName() == null) {
//			addFieldError("studentBean.firstName", "El nombre es obligatorio.");
//		}
//		if (studentBean.getLastName().isEmpty() || studentBean.getLastName() == null) {
//			addFieldError("studentBean.lastName", "El apellido es obligatorio.");
//		}
//		if (studentBean.getEmail().isEmpty() || studentBean.getEmail() == null) {
//			addFieldError("studentBean.email", "El email es obligatorio.");
//		}
//		if (studentBean.getBirthDate() == null) {
//			addFieldError("studentBean.birthDate", "La fecha de nacimiento es obligatoria.");
//		}
//		if (studentBean.getStartDate() == null) {
//			addFieldError("studentBean.startDate", "La fecha de inicio es obligatoria.");
//		}
//		if (studentBean.getEndDate() == null) {
//			addFieldError("studentBean.endDate", "La fecha fin es obligatoria.");
//		}
	}
}
