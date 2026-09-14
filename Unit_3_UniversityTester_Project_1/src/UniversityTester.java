/*Kevin Toromani
 * Mr. G Seow
 * Project #1: UniversityTester
 * ICS4U1-01
 * Friday, December 13, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//Start of the public class UniversityTester class
public class UniversityTester {
	//Start of the public static void main method
	public static void main(String[] args) {
		//Calls the Scanner class and creates an object called in used to read the input from the user
		Scanner in = new Scanner(System.in);
		//Initialization of the object employ1 with the precept of a String "Seow" and an integer 20000.00 as type double
		UEmployee employ1 = new UEmployee("Seow", 20000.00);
		//Initialization of the object employ2 with no precept
		UEmployee employ2 = new UEmployee();
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the UEmployee class");
		//Outputs the name and salary from the constructor method
		System.out.println("UEmployee name: " + employ1.getName() + " salary: " + employ1.getSalary());
		//Outputs the name and salary from the empty constructor method
		System.out.println("UEmployee name: " + employ2.getName() + " salary: " + employ2.getSalary());
		//Outputs starts to divide the sections of code and outputs
		System.out.println("*************************************************************************");
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the Facilty class");
		//Initialization of the object fa1 with no precept
		Faculty fa1 = new Faculty();
		//Initialization of the object fa2 with the precept of a String "Seow", a integer 20000.00 as type double and a String "Science"
		Faculty fa2 = new Faculty("Seow", 20000.00, "Science");
		//Asks the user what faculty with the precept name is in
		System.out.println("What faculty is " + fa1.getName() + " in?");
		//Initialization of the variable faculty1 as type String and assigns the users input to it
		String faculty1 = in.next();
		//Passes the variable faculty1 through setDepartment
		fa1.setDepartment(faculty1);
		//Outputs the method toString with the information given and the precepts
		System.out.println(fa1.toString());
		//Outputs the name from the constructor method and asks the user what faculty they are in
		System.out.println("What faculty is " + fa2.getName() + " in?");
		//Initialization of the variable faculty2 as type String and assigns the users input to it
		String faculty2 = in.next();
		//Passes the variable faculty2 through the precept constructor
		fa2.setDepartment(faculty2);
		//Outputs the method toString with the information given and the precepts
		System.out.println(fa2.toString());
		//Shows id the getDepartment method is working
		System.out.println("Department is: " + fa1.getDepartment());
		//Shows id the getDepartment method is working
		System.out.println("Department is: " + fa2.getDepartment());
		//Outputs starts to divide the sections of code and outputs
		System.out.println("*****************************************************************************");
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the Staff class");
		//Initialization of the object st1 with no precept
		Staff st1 = new Staff();
		//Initialization of the object fa2 with precept of a String "Seow", an integer 20000.00 as type double and a String "Coding"
		Staff st2 = new Staff("Seow", 20000.00, "Coding");
		//Asks the user what faculty with the precept name is in
		System.out.println("What job does " + st1.getName() + " do?");
		//Initialization of the variable job1 as type String and assigns the users input to it
		String job1 = in.next();
		//Passes the variable job1 through setJob
		st1.setJob(job1);
		//Outputs the method toString with the information given and the precepts
		System.out.println(st1.toString());
		//Outputs the name from the constructor method and asks the user what faculty they are in
		System.out.println("What job does " + st2.getName() + " do?");
		//Initialization of the variable job2 as type String and assigns the users input to it
		String job2 = in.next();
		//Passes the variable job2 through the precept constructor
		st2.setJob(job2);
		//Outputs the method toString with the information given and the precepts
		System.out.println(st2.toString());
		//Shows if the getJob method is working
		System.out.println("His job is " + st1.getJob());
		//Shows if the getJob method is working
		System.out.println("His job is " + st2.getJob());
		//Closes the Scanner class
		in.close();
	//End of the public static void main method
	}
//End of the public class Main class
}