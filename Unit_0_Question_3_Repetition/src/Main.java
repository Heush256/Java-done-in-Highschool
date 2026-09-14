/*Kevin Toromani
 * Mr. G Seow
 * Question 3—Repetition
 * ICS4U1-01
 * Friday, September 20, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//Start of the main class
public class Main{
	//Start of the public static void main class
	public static void main(String [] args) {
		//Calls the scanner class and reads input from the user
		Scanner input = new Scanner(System.in);
		//Initialization of variables: num1, num2, GCF and less as type int
		int num1, num2, GCF , less;
		//Asks the user to input their 1st number
		System.out.println("Enter you 1st number: ");
		//Assigns the input to num1
		num1 = input.nextInt();
		//Asks the user to input their 2nd number
		System.out.println("Enter you 2st number: ");
		//Assigns the input to num2
		num2 = input.nextInt();
		//Passes num1 and num2 into method Check and assigns the result to the variable less
		less = Check(num1, num2);
		//Passes num1, num2 and less into method GCF and assigns the result to the variable GCF
		GCF = GCF(num1, num2, less);
		//Outputs the GCF
		System.out.println("The GCF is should be " + GCF);
		//Closes the Scanner class
		input.close();
		//End of the public static void main class
	}
	//Start of the public static int GCF method taking in num1 && num2 && less as type int
	public static int GCF(int num1, int num2, int less) {
		//Initialization of variable: GCF at 0
		int GCF = 0;
		//Start of for loop, initialization of int i at 1, checks if i is less than the variable less, and adds 1 to the variable i
		for(int i = 1; i <= less; i++) {
			//Start of the if statement and checks if the variable num1 and num2 divided by i has a remainder of 0
			if(num1 % i == 0 && num2 % i == 0) {
				//Sets the variable GCF to the value of i if the condition is met
				GCF = i;
			//End of if statement
			}
		//End of for loop
		}
		//Returns the GCF back to the public static void main method
		return GCF;
	//End of the public static int GCF method
	}
	//Start of the public static int Check method that takes in num1 && num2 as type int
	public static int Check(int num1, int num2) {
		//Initialization of variable: less at 0
		int less = 0;
		//Start of the 1st if statement, checks if num1 is greater then num2
		if(num1 > num2) {
			//If the condition is satisfied then num1 is assigned to the variable less
			less = num1;
		//End of 1st if statement
		}
		//Start of the 2nd if statement, checks if num2 is greater than num1
		if(num2 > num1) {
			//If the condition is satisfied then num2 is assigned to the variable less
			less = num2;
		//End of the 2nd if statement
		}
		//Returns the variable less to the public static void main method
		return less;
	//End of the public static int Check method
	}
//End of the class Main
}