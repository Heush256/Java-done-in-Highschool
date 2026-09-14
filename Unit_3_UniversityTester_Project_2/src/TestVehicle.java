/*Kevin Toromani
 * Mr. G Seow
 * Project #2: TestVehicle
 * ICS4U1-01
 * Friday, December 13, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.Scanner;
//Start of the public class UniversityTester class
public class TestVehicle {
	//Start of the public static void main method
	public static void main(String[] args) {
		//Calls the Scanner class and creates an object called in used to read the input from the user
		Scanner in = new Scanner(System.in);
		//Initialization of the object vh with the precept of a String "Yamaha", String "Black" and a boolean true
		Vehicle vh = new Car("Yamaha", "Black", true);
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the Vehicle class");
		//Outputs the precept manufacturer and color from the constructor method
		System.out.println("Vehicle manufacturer: " + vh.getManufacturer() + " color: " + vh.getColor());
		//Asks the user to enter a new manufacturer
		System.out.println("Enter the manufacturer: ");
		//Initialization of the variable newman as type String and assigns the users input to it
		String newman = in.next();
		//Passes the variable newman through setManufacturer
		vh.setManufacturer(newman);
		//Asks the user to enter a new clour
		System.out.println("Enter the colour: ");
		//Initialization of the variable newcol as type String and assigns the users input to it
		String newcol = in.next();
		//Passes the variable newcol through setColor
		vh.setColor(newcol);
		//Outputs the manufacturer and color that user inputed
		System.out.println("New manufacturer: " + vh.getManufacturer() + " new colour " + vh.getColor());
		//Outputs starts to divide the sections of code and outputs
		System.out.println("*************************************************************************");
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the Car class");
		//Initialization of the object car with the precept of a String "Tesla", String "Black" and a boolean true
		Car car = new Car("Tesla", "Black", true);
		//Outputs the precept manufacturer, color, convertible, sound and vehicleType from the constructor method precept
		System.out.println("Manufacturer is: " + car.getManufacturer() + " color: " + car.getColor() +
				
				" convertible: " + car.getConvertable() + " sound: " + car.sound() + " type: " + car.vehicleType());
		//Outputs the method toString with the information given and the precepts
		System.out.println(car.toString());
		//Asks the user to set the convertible, entering true or false
		System.out.println("Set convertable (true or false): ");
		//Initialization of the variable cars as type String and assigns the user input to it
		String cars = in.next();
		//Start of the if statement and checks if the value of the variable cars matches "true"
		if(cars.equalsIgnoreCase("true")) {
		//If the if statement is true, then the boolean true is passes into the setConvertable method
		car.setConvertable(true);
		//End of the if statement
		}
		//Start of the else statement
		else {
			//If the if statement is false, then the boolean false is passed into the setConvertable mathod
			car.setConvertable(false);
		//End of the else statement
		}
		//Outputs the method toString with the information given
		System.out.println(car.toString());
		//Outputs starts to divide the sections of code and outputs
		System.out.println("*****************************************************************************");
		//Outputs what the next lines of code with be testing the methods of a certain class
		System.out.println("Checks the Motorcycle class");
		//Initialization of the object car with the precept of a String "Yamaha", String "Black" and a Sting "Short"
		Motorcycle st1 = new Motorcycle("Yamaha", "Black", "Short");
		//Outputs the precept manufacturer, type, sound and vehicleType from the constructor method precept
		System.out.println("Manufacturer is: " + st1.getManufacturer() + " type is: " + st1.getType() +
				
				" sound: " + st1.sound() + " vehicleType: " + st1.vehicleType());
		//Outputs the method toString with the information given and the precepts
		System.out.println(st1.toString());
		//Asks the user to set the type
		System.out.println("Set the type: ");
		//Initialization of the variable type as type String and assigns the user input to it
		String type = in.next();
		//Passes the variable jpb1 through setColor
		st1.setType(type);
		//Outputs the method toString with the information given
		System.out.println(st1.toString());
		//Shows if the getType method is working
		System.out.println("Type is " + st1.getType());
		//Closes the Scanner class
		in.close();
	//End of the public static void main method
	}
//End of the public class Main
}