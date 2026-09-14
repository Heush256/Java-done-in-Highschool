/*Kevin Toromani
 * Mr. G Seow
 * Project #2: Pascal’s triangle
 * ICS4U1-01
 * Thursday, October 17, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//Start of the public class Main class
public class Main {
	//Start of the public static void main method
	public static void main(String[] args) {
		//Calls the Scanner class and and reads import form the user
		Scanner input = new Scanner(System.in);
		//Outputs to the user to enter the amount rows they wish to output
		System.out.print("Enter the row number you wish to output: ");
		//Initialization of the variable num as type integer and reads the input from the user and assigns it to num
		int num = input.nextInt();
		//Initialization of the two-D array pass as type integer and its dimensions are set to num
		int [][] pass = new int [num][num];
		//Initialization of the variable count as type integer and set it to minus two
		int count = -2;
		//Passes the variable num, count, two-D array pass into the Array method
		pass = Array(num, count, pass);
		//Start of the first for loop, initializing i to zero, checks if i is less than num, and increments i by one
		for(int i = 0; i < num; i++) {
			//Start of the second for loop, initializing j to zero, checks if j is less than or equal to i, and increments j by one
			for(int j = 0; j <=i; j++) {
				//Outputs the value of pass at position i, j
				System.out.print(pass[i][j] + " ");
			//End of the second for loop
			}
			//Outputs nothing and is used for formating the output
			System.out.println("");
		//End of the first for loop
		}
		//Closes the Scanner class
		input.close();
	//End of the public static void main method
	}
	//Start of the public static int [][] Array method, taking in num, count, two-D array pass as type integer
	public static int [][] Array(int num, int count, int [][] pass){
		//Start of the first for loop, initializing i to zero, checks if i is less than num, and increments i by one
		for(int i = 0; i < num; i++) {
			//Increments count by one ever time the for loop is ran
			count++;
			//Start of the second for loop, initializing j to zero, checks if j is less than or equal to i, and increments j by one
			for(int j = 0; j <= i; j++) {
				//Start of the if statement and checks of the value of j is equal to zero
				if(j == 0) {
					//If the if statement id true then the value at position i, 9 is set to 1
					pass [i][0] = 1;
				//End of the if statement
				}
				//Start of the else if statement and checks if the value of j and i are equal to each other
				else if(j == i) {
					//If the else of statement of true then it sets the value at position i, j to one
					pass[i][j] = 1;
				//End of the else if statement
				}
				//Start of the else statement
				else {
					//Sets the value of pass at position i, j to the value of the sum of pass at count, j minus one plus count, j
					pass[i][j] += pass[count][j-1] + pass[count][j];
				//End of the else if statement
				}
			//End of the second for loop
			}
		//End of the first for loop
		}
		//Returns pass
		return pass;
	//End of the public static int [][] Array method
	}
//End of the public class Main file
}