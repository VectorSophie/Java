package kosa.Relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> students;
	
	public Course () {}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void printCourse() {
		System.out.println("과목명: "+ courseName);
		for (Student student: students) {
			System.out.println("수강신청 학생: "+ student.getName());
		}
	}
}
