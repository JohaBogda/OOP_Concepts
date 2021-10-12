package OOPConcepts;

// import in order to use user input from those pages: 
import OOPConcepts.Student;
import OOPConcepts.Employee;
import OOPConcepts.Person1;

public class Starter {

	public static void main(String[] args) {
		
//		Hardcoded values: 
//		Student Student1 = new Student("Johanna", "Bogdanow", 29, 'F', "Junior", 233, 425);
//		Employee Employee1 = new Employee("Walter", "Smith", 54, 'M', 4, 73000, 5000, false);

		Student student = new Student();
		Employee employee = new Employee();
		Person1 person = new Person1();
		
		Student1.scan();
		Student1.display();
		
		
		
	}

}
