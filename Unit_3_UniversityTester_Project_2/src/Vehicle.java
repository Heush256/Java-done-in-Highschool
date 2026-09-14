public abstract class Vehicle { //Start of abstract superclass Vehicle
	
	//Create members variable for manufacturer and colour of type string.
	
	String Manufacturer; // enter your code here
	
	String Colour; // enter your code here
	
	public Vehicle(String manufacturer, String color) { //Vehicle constructor which takes in manufacturer
		
		//Parameters of manufacturer and colour and sets it to it's member variables
		
		Manufacturer = manufacturer; //initialize manufacturer
		
		Colour = color; //initialize colour
		
	}
	
	public String getManufacturer() { //Gets the manufacturer
		
		return Manufacturer; //Enter your code here
		
	}
	
	public void setManufacturer(String manufacturer) { //Sets the manufacturer name
		
		Manufacturer = manufacturer; //Enter your code here
		
	}
	
	public String getColor() { //Gets the color of the vehicle
		
		return Colour; //Enter your code here
		
	}
	
	public void setColor(String color) { //Sets the color of the vehicle
		
		Colour = color; // Enter your code here
		
	}
	
	abstract String sound(); //Abstract method sound() which outputs a String sound
	
	abstract String vehicleType(); //Abstract method vehicleType() which outputs the type of vehicle
	
	public abstract String toString(); //Abstract toString() method which should output the details of the car
	
}