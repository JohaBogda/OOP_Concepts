package OOPConcepts;

import java.util.Scanner;

public class Student extends Person {

	String year; 
	int currentCredits;
	int neededCredits;
	
	Student(String firstName, String lastName, int age, char gender, String year, int currentCredits, int neededCredits){
		super(firstName, lastName, age, gender);
		this.year = year;
		this.currentCredits = currentCredits;
		this.neededCredits = neededCredits;
	}
	
	// Scanner boiler plate: 
	public void scanner() {
	
	// get user input: 
	Scanner scan = new Scanner(System.in);
	System.out.println("Student's first name: ");
	firstName = scan.next();
	
	System.out.println("Student's last name: ");
	lastName = scan.next();
	
	System.out.println("Student's age: ");
	age = scan.nextInt();
	
	System.out.println("Student's gender: ");
	gender = scan.next().charAt(0);
	
	}
}
