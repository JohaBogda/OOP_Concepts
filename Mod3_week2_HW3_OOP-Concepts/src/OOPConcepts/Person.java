package OOPConcepts;

public class Person {
	
	// declare variables
	String firstName;
	String lastName;
	int age;
	char gender;

	// Default constructor: 
	Person(){
		
	}
	
	// Parametrized constructor: 
	Person(String firstName, String lastName, int age, char gender){
	this.firstName = firstName; 
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	}
	
	// method being used for all classes to override: 
	void display() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
	}
	

}
