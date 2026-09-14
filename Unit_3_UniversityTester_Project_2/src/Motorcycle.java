public class Motorcycle extends Vehicle{ //Start of subclass Motorcycle which inherits Vehicle
	
	private String bikeType;
	
	public Motorcycle(String manu, String color, String type) { //Motorcycle constructor which takes manufacturer, color and type
		
		super(manu, color); // initialize manufacturer(i.e manu) and colour (i.e. color) to superclass vehicle
		
		bikeType = type; //sets member variable type to bikeType
		
	}
	
	public String getType() { //Gets the type of bike
		
		return bikeType; //enter your code here
		
	}
	
	public void setType(String type) { //Sets the type of bike it is
		
		bikeType = type; //enter your code here
		
	}
	
	//Need to create methods for sound(), vehicleType() and toString()
	
	public String sound() { //outputs sound that motorcycle makes "zoom zoom"
		
		return "zoom zoom"; //enter your code here
		
	}
	
	public String vehicleType() { //returns the vehicle type "Motorcycle"
		
		return "Motorcycle";
		
	}
	
	public String toString() {//Prints information of a motorcycle's colour, manufacturer, vechicle type, and the sound
		
		return "Motorcycle's colour: " + super.getColor() + " manufacturer: "
		
		+ super.getManufacturer() + " vehicle type: " + getType() + " sound: " + sound(); // Enter your code here
		
	}
	
}