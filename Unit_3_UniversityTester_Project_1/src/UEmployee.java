public class UEmployee { //Start of super class UEmployee
	
	private String Name; //Create private member variables for employee name
	
	private double Salary; //Create private member variable for employee salary
	
	public UEmployee() { //Default UEmployee constructor.
		
		Name = ""; //Set employee name to be "" 
		
		Salary = 0; //set employee salary to be 0
		
	}
	
	public UEmployee(String name, double salary) {
		//UEmployee constructor which have parameters of name and salary and sets it to it's member variables
		
		Name = name; //Enter your code here for setting the name
		
		Salary = salary; //Enter your code here for setting the salary
		
	}
	
	public String getName() { //Gets the name
		
		return Name;//Enter your code here
		
	}
	
	public double getSalary() { //Gets the Salary
		
		return Salary; // Enter your code here
		
	}
	
}