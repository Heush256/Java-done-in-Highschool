/*Kevin Toromani
 * Mr. G Seow
 * Project #2: Ternary search
 * ICS4U1-01
 * Thursday, November 21, 2024
 */
import java.util.Scanner;

public class Searches{ //Start of Searches class
	
	public static void main(String [] args){ //Start of main
		
		Scanner input = new Scanner(System.in);
		//You can modify this array and this code for testing
		int []myArray = {-17, -10, -8, 2, 3, 8, 16, 20, 34, 41, 50};
		
		System.out.println("Numbers: -17, -10, -8, 2, 3, 8, 16, 20, 34, 41, 50");
		
		System.out.print("Which number do you wish to search using Ternary Search? ");
		
		int target = input.nextInt();//modify so the user enters a value
		
		int posn = ternarySearch(myArray, 0, 10, target ); //Calls ternarySearch to find position
		
		if(posn >= 0) {
			
		System.out.println("The position of "+ target +" is " + posn);
		
		}
		
		else {
			
			System.out.println("This element is not present in the list of items!");
			
		}
		
		input.close();
		
	} //End of main
	
	
	public static int ternarySearch(int[] items, int start, int end, int goal){ //Start of ternarySearch
		//Enter your code here
		//Start of the while loop and checks if the value of start is less than or equal to the value of end
		while(start <= end) {
			//Initialization of the variable mid as type integer and is the result of the value of start plus end divided by three
			int mid3 = (start + end) / 3;
			//Start of the first else if statement and checks if the value goal is less than the value at position mid3 in the array items
			if(goal <= items[mid3]) {
				//If the else if statement is true then end variable is assigned to mid3 minus one
				end = mid3;
				//Start of the for loop initialization i to the value of start checks is it is less than or equal to end and adds one
				for(int i = start; i <= end; i++) {
					//Start of if statement and checks if the value at position i in the array list is equal to the value of goal
					if(items[i] == goal) {
						//If the if statement is true then the value of i is returned
						return i;
					//End of the if statement
					}
				//End of the for loop
				}
				//If the if statement is false then minus one is returned
				return -1;
			//End of the first else if statement
			}
			//Start of the second else if statement and checks if goal is less than the value at position twice times mid3 in the array items and if goal is greater than the value at position mid3 in array list
			else if(goal <= items[2*mid3] && goal > items[mid3]) {
				//If the else if statement is true then the value of start to mid3 plus one
				start = mid3 + 1;
				//Sets the value of end to twice times mid3 minus one
				end = 2*mid3;
				//Start of the for loop initializing i to the value of start checks if it is less than or equal to the end value and adds one
				for(int i = start; i <= end; i++) {
					//Start of the if statement and checks if the value in array list at position i is equal to the value of goal
					if(items[i] == goal) {
						//If the if statement is true then the value of i is returned
						return i;
					//End of the if statement
					}
				//End of the for loop
				}
				//If the if statement is false then minus one is returned
				return -1;
			//End of the second else if statement
			}
			//Start of the third else if statement and checks if goal is less than the value at the last position in the array items and if goal is greater than the value at position twice times mid3 in array list
			else if(goal <= items[items.length - 1] && goal > items[2*mid3]) {
				//If the else if statement is true then the value of start is set to twice times mid3 plus one
				start = 2*mid3 + 1;
				//Start of for loop initializing i to the value of start checks if it is less than the length of the array items and adds one
				for(int i = start; i < items.length; i++) {
					//Start of the if statement and checks if the value in array list at position i is equal to the value of goal
					if(items[i] == goal) {
						//If the if statement is true then the value of i is returned
						return i;
					//End of the if statement
					}
				//End of the for loop
				}
			//End of the third else if statement
			}
		//End of the while loop
		}
		//If the while loop if false then the value minus one is return
		return -1;
	//End of the public static int [] ternarySearch method
	}
//End of the public class Searcher
}