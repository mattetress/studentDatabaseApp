package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
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
	public void enroll() {
		// Get inside a loop, user hits 0 
		do {
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += costOfCourse;
			} else { break; }
			
		} while (1 != 0);
		System.out.println("Enrolled in Courses: \n" + courses );
		System.out.println("Tuition Balance: $" + tuitionBalance);
	}
	
	// view balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// pay tuition
	public void payTuition(int payment) {
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// show status

}
