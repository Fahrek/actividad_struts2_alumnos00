package org.demo.actions;

import lombok.*;
import org.demo.actions.beans.Student;
import com.opensymphony.xwork2.ActionSupport;

import static org.apache.struts2.ServletActionContext.getRequest;

@Setter
@Getter
public class IntroAction extends ActionSupport {
	private int studentId;
	// Setter methods
	private boolean showStudentInfo;

	@Override
	public String execute() {
		// Obteniu l'identificador d'estudiant a partir dels paràmetres de la sol·licitud
		String dni = getRequest().getParameter("studentDni");
		StudentService service = StudentService.getInstance(); // Utiliza la instancia singleton de StudentService
		Student student = null;

		try {
			student = service.findByDni(Integer.parseInt(dni));
			setShowStudentInfo(student != null);
			if (student == null) {
				addActionError("Student not found.");
				return ERROR;
			}
		} catch (Exception e) {
			addActionError("Invalid student id.");
			return ERROR;
		} finally {
			setStudentId(student == null ? 0 : student.getId());
		}

		return SUCCESS;
	}
}