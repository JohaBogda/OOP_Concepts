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
	

}
