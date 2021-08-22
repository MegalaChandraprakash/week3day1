package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("studentName is pooja");

	}
public void studentDept() {
	System.out.println("studentDept is literature");
}
public void studentId() {
	System.out.println("studentId is JWSER");

}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.CollegeName();
		stud.CollegeCode();
		stud.CollegeRank();
		stud.deptName();

	}

}

