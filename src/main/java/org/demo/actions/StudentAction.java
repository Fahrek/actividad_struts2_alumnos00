package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;
import org.demo.actions.beans.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentAction extends ActionSupport {

	private Student studentBean;
	private String dni;
	private Map<String, Object> session;
	private final List<Student> STUDENTS = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		// Recuperar el alumno del Map de la sesión usando el DNI como clave
		studentBean = (Student) session.get(dni);
		if (studentBean == null) {
			// Si no se encuentra el alumno, devolver ERROR y añadir un mensaje
			addActionError("No se ha encontrado ningún alumno con el DNI " + dni);
			return ERROR;
		} else {
			// Si se encuentra el alumno, devolver SUCCESS
			return SUCCESS;
		}
	}

	public Student getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(Student studentBean) {
		this.studentBean = studentBean;
	}

	public String showStudentInfo() throws Exception {
		// Verifica si el DNI está presente, redirecciona a la página de detalles del estudiante
		if (dni == null || dni.isEmpty()) {
			addActionError("El DNI es obligatorio.");
			return INPUT;
		}
		return SUCCESS;
	}

	public String registerStudent() throws Exception {
		// Valida los datos del formulario y almacena la información en memoria
		if (studentBean == null) {
			addActionError("No se ha recibido ningún alumno.");
			return INPUT;
		}
		return SUCCESS;
	}

	@Override
	public void validate() {
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
