package org.demo.actions;

import java.util.ArrayList;
import java.util.List;

import org.demo.actions.beans.Student;

public class StudentService {
	private final List<Student> students;
	private static StudentService instance;

	public StudentService() {
		this.students = new ArrayList<>();
	}

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}
		return instance;
	}

	public Student findByDni(int dni) {
		for (Student student : students) {
			if (student.getDni() == dni) {
				return student;
			}
		}
		return null;
	}

	public List<Student> findAllStudents () {
		return new ArrayList<>(students);
	}

	public void saveStudent (Student student){
		students.add(student);
	}
}