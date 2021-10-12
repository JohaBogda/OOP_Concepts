package OOPConcepts;

import java.util.Scanner;

public class Employee extends Person implements Interface {

	int id; 
	int salary;
	int bonus;
	boolean retired;
	
	// empty constructor: 
	public Employee(){
		// unsure if this works:
		id++;
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
	Scanner scan = new Scanner(System.in);
		
	// get user input: 
	System.out.println("Employee's first name: ");
	firstName = scan.next();
	
	System.out.println("Employee's last name: ");
	lastName = scan.next();
	
	System.out.println("Employee's age: ");
	age = scan.nextInt();
	
	System.out.println("Employee's gender: ");
	gender = scan.next().charAt(0);
		
	}
	
	//calculate salary using Interface: 
    // changing int into a double
public double calculate(int bonus) {
	
	double netsalary = bonus + this.salary;
	return netsalary;
	
}

	public void display() {
		super.display();
		System.out.println("Employee ID : " + this.id);
		System.out.println("Employee Salary : $" + calculate(this.bonus));
}}
