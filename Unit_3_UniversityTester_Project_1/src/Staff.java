public class Staff extends UEmployee{ //Start of Staff class inherits UEmployee
	
	private String jobtitle = "";//create a member private variable for jobtitle
	
	public Staff() { //default staff contructor
		
		super();//Calls superclass UEmployee constructor of blank parameter
		
		jobtitle = "";//Sets job title as type ""
		
	}
	
	public Staff(String name, double salary, String job) { //Constructor which takes in name, salary and job
		
		super(name, salary); //Calls UEmployee constructor passing name and salary to the super class UEmployee
		
		jobtitle = job; //sets job to it's member variable jobtitle
		
	}
	
	public String getJob() { //Gets job
		
		return jobtitle; //Enter your code here
		
	}
	
	public void setJob(String job) { //Sets job
		
		jobtitle = job; //Enter your code here
		
	}
	
	public String toString(){ //Start of toString, overrides default toString
		
		String ds;// returns the employee's name, salary and job title
		
		ds = "Name: " + super.getName() + " salary: " + super.getSalary() + " job title: " + jobtitle;
		
		return ds;
	
	}
	
}