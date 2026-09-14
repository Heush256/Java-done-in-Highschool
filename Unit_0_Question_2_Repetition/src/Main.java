/*Kevin Toromani
 * Mr. G Seow
 * Question 2—Repetition
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
    //Initialization of variables: num and ans as type int
    int num, ans;
    //Outputs a statement that asks the user to enter a number
    System.out.println("Enter a number: ");
    //Assigns the users input to num
    num = input.nextInt();
    //Passes the variable num to the method Oddsum and Assigns the result to ans
    ans = Oddsum(num);
    //Prints out the ans
    System.out.println("The output is " + ans);
    //Closes the Scanner class
    input.close();
  //End of the public static void main method
  }
	//Start of the public static int Oddsum method, taking in num as an in
	public static int Oddsum (int num) {
    //Initialization of variable: result as int
    int result = 0;
    //Start of the while loop, and checks if num is grater then 1
    while(num > 1) {
      //Start of the if statement and checks if the number divided by 2 gives a remainder of 1
      if(num % 2 == 1) {
        //If the if statement is satisfied, then num is added to the variable result
        result += num;
        //Outputs the number and an additions sign
        System.out.print(num + " + ");        
        //End of if statement
      }
      //Decreased the variable num by -1
      num--;
      //End of while loop
    }
    //Start of the while loop, and checks if num is great then -1
    while(num < 1) {
      //Start of the if statement and checks if the number divided by 2 gives a remainder of -1
      if(num % 2 == -1) {
    	//If the if statement is satisfied, then num is added to the variable result
        result += num;
      //Outputs the number and an additions sign
      System.out.print(num + " + ");
      //End of if statement
      }
      //Increases the variable num by +1
      num++;
    //End of while loop
    }
    //Start of the if statement and checks if the num is equal to 1
    if(num == 1){
      //If the if statement is true, then it outputs the number and an equal sign
      System.out.print(num + " = ");
      //Adds 1 to the result
      result += 1;
      //End of if statement
    }
    //Returns the value of result back to the public static void main method
    return result;
    //End of the public static int Oddsum method
  }
//End of public class Main
}