package OOPConcepts;

import java.util.Scanner;
// ecapsulation with getters and setters: 

public class Person1 {

	// private variable: 
	private int ssn;
	private int phone;
	
	
	// getter:
	public int getSsn() {
		return ssn;
	}
	
	// setter:
	public void setSsn(int ssn) {
		this.ssn = ssn;
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
	person.setSsn(scan.nextInt());

	System.out.println("Enter Person1 phone number: ");
	person.setPhone(scan.nextInt());

	System.out.println("Person1 SSN :" + person.getSsn());
    System.out.println("Person1 Phone :" + person.getPhone());

    void display() {
    	
    }
}
