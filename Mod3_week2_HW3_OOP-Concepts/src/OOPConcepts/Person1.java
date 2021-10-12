package OOPConcepts;

import java.util.Scanner;
// ecapsulation with getters and setters: 

public class Person1 {

	// private variable: 
	private int SSN;
	private int phone;
	
	
	// getter:
	public int getSSN() {
		return SSN;
	}
	
	// setter:
	public void setSSN(int SSN) {
		this.SSN = SSN;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

// Scanner boiler plate: 
	Scanner scan = new Scanner(System.in);
	Person1 person = new Person1();
	
	System.out.println("Enter Person1 SSN : ");
	person.setSSN(scan.nextInt());

	System.out.println("Enter Person1 phone number: ");
	

	public static void main(String[] args) {

	}

}
