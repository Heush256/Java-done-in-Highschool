public class Faculty extends UEmployee{ //Start of Faculty class which inherits UEmployee
	
	private String depName;//Create private member variables for department name
	
	public Faculty() { //Faculty default constructor 
		
		super(); //Calls superclass UEmployee constructor of blank parameter
		
		depName = ""; //Sets depName as type ""
		
	}
	
	public Faculty(String name, double salary, String departmentName) {
		//Faculty constructor which takes in name, salary and depName
		
		super(name, salary); //Calls UEmployee constructor passing name and salary to the super class UEmployee
		
		depName = departmentName; //sets depertmentName to it's member variable department name
		
	}
	
	public String getDepartment() { //Returns department
		
		return depName;
		
	}
	
	public void setDepartment(String department) { //Sets department
		
		depName = department;
		
	}
	
	public String toString(){ //Start of toString which replaces original toString
		
		String ds; // returns the employee's name, salary and department name
		
		ds = "Name: " + super.getName() + " salary: " + super.getSalary() + " job title: " + depName;
		
		return ds;
		
	}
	
}