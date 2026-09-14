/*Kevin Toromani
 * Mr. G Seow
 * Question 1—Selection Statements
 * ICS4U1-01
 * Friday, September 20, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//java is the package, text is the subsection, * is all of the classes
import java.text.*;
//Start of the main class
public class Main{
	//Start of the public static void main class
	public static void main(String [] args) {
		//Calls the scanner class and reads input from the user
		Scanner input = new Scanner(System.in);
		//Calls the Number Format class and sets the value of variables to 1 decimal place
		NumberFormat df = new DecimalFormat("0.0");
		//Initialization of variables: a, b, c, x, and check as double, and setting them all to 0
		double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, check = 0;
		//Initialization of variable: end as a String
		String end = "";
		//Asks the user for a value of a
		System.out.println("Submit an a value: ");
		//Assigns the input of the user to the variable a
		a = input.nextDouble();
		//Asks the user for a value of b
		System.out.println("Submit an b value: ");
		//Assigns the input of the user to the variable b
		b = input.nextDouble();
		//Asks the user for a value of c
		System.out.println("Submit an c value: ");
		//Assigns the input of the user to the variable c
		c = input.nextDouble();
		//Sends the values a, b, and c into method Checking and returns a String to end
		end = Checking(a, b, c);
		//Sends the values a, b, and c into method Checked and returns a value of a type double to check
		check = Checked(a, b, c);
		//Checks if the variable check is less than 0
		if(check < 0) {
		//If the condition is true then it outputs the String end
		System.out.println(end);
		//End of the if statement
		}
		//Checks if the variable check is grater than or equal to 0 and start of 1st if statement
		if(check >= 0) {
		//If the condition is true, then the variables a, b, and check are sent to method Root1 and then returns a value of a type double to x1
		x1 = Root1(a, b, check);
		//If the condition is true, then the variables a, b, and check are sent to method Root1 and then returns a value of a type double to x2
		x2 = Root2(a, b, check);
		//Checks if the values x1 and x2 are equal and start of 2nd if statement
		if(x1 == x2) {
			//Outputs 1 root of the equation if they are equal
			System.out.println("The root is " + df.format(x1));
		//End of 2nd if statement
		}
		//Start of else statement and runs if the if statement is not satisfied
		else{
		//Outputs the roots of the equation
		System.out.println("The roots are " + df.format(x1) + " and " + df.format(x2));
		//End of the else statement
		}
		//End of the 1st if statement
		}
		//Closes the Scanner class
		input.close();
		//End of the public static void main method
	}
	//Start of the public static double Checked method, taking in a, b, and c as a double
	public static double Checked (double a, double b, double c) {
		//Initialization of variable check as a type double and setting the value to 0
		double check = 0;
		//Assigns the value to the variable check
		check = b*b - 4*a*c;
		//Returns the variable check back to the public static void main method
		return check;
	//End of the public static double Checked method
	}
	//Start of the public static String Checking method, taking in a, b, and c as a double
	public static String Checking (double a, double b, double c) {
		//Initialization of variable check as a type double and setting the value to 0
		double check = 0;
		//Assigns the value to the variable check
		check = b*b - 4*a*c;
		//Start of the if statement and checks if the variable check is less than 0
		if(check < 0) {
			//Returns a String back to the public static void main method
			return "This equation does not have REAL roots.";
		//End of the if statement
		}
		//Returns an empty String back to the public static void main method
		return "";
	//End of the public static String Checking method
	}
	//Start of the public static double Root1 method, taking in a, b, c, and check as a double
	public static double Root1 (double a, double b, double check) {
		//Initialization of variable x1 as a type double and setting the value to 0.0
		double x1 = 0.0;
		//Does the calculations for the 1st root of the equation
		x1 = (-b + Math.sqrt(check)) / (2.0 * a);
		//Returns the variable x1 back to the public static void main method
		return x1;
	//End of the public static double Root1 method
	}
	
	public static double Root2 (double a, double b, double check) {
		//Initialization of variable x1 as a type double and setting the value to 0.0
		double x2 = 0.0;
		//Does the calculations for the 2nd root of the equation
		x2 = (-b - Math.sqrt(check)) / (2.0 * a);
		//Returns the variable x2 back to the public static void main method
		return x2;
	//End of the public static double Root2 method
	}	
//End of public class Main
}