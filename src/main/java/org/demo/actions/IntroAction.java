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
		// Get student ID from request parameters
		String dni = getRequest().getParameter("studentDni");
		StudentService service = new StudentService();
		Student student = null;

		try {
			student = service.findByDni(Integer.parseInt(dni));
			setShowStudentInfo(student != null);
		} catch (Exception e) {
			// Handle exceptions here

		} finally {
			setStudentId(student == null ? 0 : student.getId());
		}

		return INPUT;
	}
}
