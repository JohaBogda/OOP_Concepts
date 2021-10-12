package OOPConcepts;

import java.util.Scanner;

public class Employee extends Person {

	int id; 
	int salary;
	int bonus;
	boolean retired;
	
	// empty constructor: 
	public Employee(){
		
	}
	
	Employee(String firstName, String lastName, int age, char gender, int id, int salary, int bonus, boolean retired){
	super(firstName, lastName, age, gender);
	this.id = id;
	this.salary = salary;
	this.bonus = bonus;
	this.retired = retired;
	}
	
	// Scanner boiler plate: 
	public void scanner() {
	
	// get user input: 
	Scanner scan = new Scanner(System.in);
	System.out.println("What's your first Name?");
	firstName = scan.next();

	}
}
