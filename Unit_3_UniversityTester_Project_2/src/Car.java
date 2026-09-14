public class Car extends Vehicle{ //Start of subClass car which inherits Vehicle
	
	boolean convertible; //Create member variable convertible of type boolean
	
	public Car(String manu, String color, boolean convert) { //Car constructor 
		
		super(manu, color); // initialize manufacturer(i.e manu) and colour (i.e. color) to superclass vehicle
		
		convertible = convert; //sets member variable convertible to convert
		
	}
	
	public void setConvertable(boolean t){ //sets if the car is a convertable or not
		
		convertible = t; // Enter your code here
		
	}
	
	public boolean getConvertable(){ //gets if the car is a convertable
		
		return convertible; // Enter your code here
		
	}
	
	//Need to create methods for sound(), vehicleType() and toString()
	
	public String sound() { //returns the sound of a car "Vroom Vroom"
		
		return "Vroom Vroom";
		
	}
	
	public String vehicleType() { //returns the vehicle type "Car"
		
		return "Car";
		
	}
	
	public String toString() { //Prints information of a car's colour, manufacturer, vechicle type, and if it's a convertible or not
		
		return "Colour: " + super.getColor() + " manufacturer: " + super.getManufacturer()
		
		+ " vehicle type: " + vehicleType() + " convertible: " + convertible; //Enter your code here
		
	}
	
}