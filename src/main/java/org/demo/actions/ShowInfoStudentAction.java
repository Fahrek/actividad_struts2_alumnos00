package org.demo.actions;

import lombok.*;
import org.demo.actions.beans.Student;
import com.opensymphony.xwork2.ActionSupport;

@Data
@EqualsAndHashCode(callSuper = true)
public class ShowInfoStudentAction extends ActionSupport {

	private Student student;

	@Override
	public String execute() {
		StudentService service = new StudentService();
		student = service.findByDni(student.getDni());

		if (student == null) {
			addActionError("Invalid student id.");
			return ERROR;
		}

		return SUCCESS;
	}
}
