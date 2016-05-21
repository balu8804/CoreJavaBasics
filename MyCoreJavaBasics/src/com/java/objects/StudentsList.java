package com.java.objects;

public class StudentsList {

	String name;
	int marks;
	int rollnumber;

	public void addingTheStudents(String sname, int smarks, int rollno) {
		name = sname;
		marks = smarks;
		rollnumber = rollno;

	}

	public void displayingTheMarks() {
		System.out.println("Name is : " + name + " Marks: " + marks
				+ " Roll Number :" + rollnumber);
	}

	public static void main(String[] args) {
		StudentsList studentlist = new StudentsList();
		StudentsList students = new StudentsList();
		students.addingTheStudents("Kumar", 95, 100);
		students.displayingTheMarks();

	}

}
