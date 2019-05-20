package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
	
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman"
				+ "\n2 - Sophomore"
				+ "\n3 - Junior"
				+ "\n4 - Senior"
				+ "\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(studentID + " - " + firstName + " " + lastName + " - " + gradeYear);
		
		
	}
	
	// Generate ID 
	private void setStudentID() {
		// Grade level + id 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	
	// enroll in courses
	
	// view balance 
	
	// pay tuition
	
	// show status

}
