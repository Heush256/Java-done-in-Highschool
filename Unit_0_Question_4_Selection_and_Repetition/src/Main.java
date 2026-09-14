/*Kevin Toromani
 * Mr. G Seow
 * Questions 4 - Selection and Repetition
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
		NumberFormat df = new DecimalFormat("0.00");
		//Calls the Random class to generate a random number
		Random rand = new Random();
		//Initialization of variables: rnum1, rnum2 and operation as type int
		int rnum1, rnum2, operation;
		//Initialization of variables: result to 0 and ans as type double
		double result = 0, ans;
		//Initialization of variables: sign to "" and contin to "n" as type String
		String sign = "", contin = "n";
		//Check to see if the variable contin is "n" and start of while loop
		while(contin.equals("n")) {
		//Calls on random generator to generate a random int from 0 to 8 and adds 1 to the number given and assigns it to rnum1
		rnum1 = rand.nextInt(9) + 1;
		//Calls on random generator to generate a random int from 0 to 8 and adds 1 to the number given and assigns it to rnum2
		rnum2 = rand.nextInt(9) + 1;
		//Calls on random generator to generate a random int from 0 to 3 and adds 1 to the number given and assigns it to operation
		operation = rand.nextInt(4) + 1;
		//Passes the variable operation into the method Sign and assigns the result to the variable sign
		sign = Sign(operation);
		//Passes the variables rnum1, rnum2 and operation into the method Result and assigns the result to the variable result
		result = Result(rnum1, rnum2, operation);
		//Prints out rnum1, sign and rnum2 to the user
		System.out.println("What is " + rnum1 + sign + rnum2 + " ?");
		//Takes the users input and assigns it to the variable ans
		ans = input.nextDouble();
		//Start of 1st if statement and checks if the variable ans is equal to the result
		if(ans == result) {
			//If the if statement is satisfied, then this output statement is printed
			System.out.println("Correct!");
		//End of 1st if statement
		}
		//Start of 2nd if statement and checks if the variable ans is not equal to result
		if(ans != result) {
			//If the if statement is true, then this outputs the correct answer
			System.out.println("Incorrect " + df.format(result));
		//End of the 2nd if statement
		}
		//Asks the user if it would like to continue
		System.out.println("Would you like to quit? (y or n)");
		//Assigns the users input to the variable contin
		contin = input.next();
		//Start of 3rd if statement and checks if the letter inputed by the user was 'y'
		if(contin.equals("y")) {
			//If the if statement is true, then this statement is printed
			System.out.println("Thank you for using Math Tutor!");
			//Closes the Scanner class
			input.close();
		//End of the 3rd if statement
		}
		//End of the while loop
		}
	//End of the public static void main method
	}
		//Start of the public static String Sign method, taking in the variable operation as type int
		public static String Sign(int operation) {
		//Initialization of variable: sign to "" as a type String
		String sign = "";
		//Start of switch statement and it takes in the variable operation
		switch(operation) {
		//If the value of operation is 1, it assigns " + " to sign and then ends
		case 1: sign = " + "; break;
		//If the value of operation is 2, it assigns " - " to sign and then ends
		case 2: sign = " - "; break;
		//If the value of operation is 3, it assigns " * " to sign and then ends
		case 3: sign = " * "; break;
		//If the value of operation is 4, it assigns " / " to sign and then ends
		case 4: sign = " / "; break;
		//End of switch statement
		}
		//Returns sign back to the public static void main method
		return sign;
		//End of the public static String Sign method
		}
		//Start of the public static double Result method, taking in rnum1, rnum2 and operation as type int
		public static double Result(int rnum1, int rnum2, int operation) {
			//Initialization of variable: result to 0 as type double
			double result = 0;
			//Start of switch statement and it takes in the variable operation
			switch(operation) {
			//If the value of operation is 1, it adds rnum1 and rnum2 and assigns it to result and then ends
			case 1: result = rnum1 + rnum2; break;
			//If the value of operation is 2, it subtracts rnum2 from rnum1 and assigns it to result and then ends
			case 2: result = rnum1 - rnum2; break;
			//If the value of operation is 3, it multiplies rnum1 and rnum2 and assigns it to result and then ends
			case 3: result = rnum1 * rnum2; break;
			/*If the value of operation is 4, it casts rnum1 and rnum2 as doubles, divides them and assigns it to result, then multiplies result by 100 and rounds it down, and
			 then it divides the result by 100 and then ends*/
			case 4: result = ((double)(rnum1) / (double)(rnum2)); result = Math.floor(result * 100); result /= 100; break;
			//End of the switch statement
			}
			//Returns result back to the public static void main method	
			return result;
		//End of the public static double Result method
		}
//End of the public class Main
}
