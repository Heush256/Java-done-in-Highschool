/*Kevin Toromani
 * Mr. G Seow
 * Project #1: Bubble Sort
 * ICS4U1-01
 * Thursday, November 21, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//Start of the public class Main
public class Main {
	//Start of the public static void main method
	public static void main(String[] args) {
		//Calls the Scanner class and creates an object called input used to read the input from the user
		Scanner input = new Scanner(System.in);
		//Asks the user to enter the number of integers to sort
		System.out.println("Enter the number of integers to sort: ");
		//Initialization of the variable length as type integer and assigns the users input to it
		int length = input.nextInt();
		//Initialization of a one dimensional array called arr as of type integer and the size is set to the value of length
		int arr[] = new int [length];
		//Asks the user to enter the amount of integers that they inputted
		System.out.println("Enter " + length + " integers: ");
		//Start of the for loop initialization of integer i to zero until it is less than the length of arr then adds one
		for(int i = 0; i < arr.length; i++) {
			//Assigns the input of the user to position i in the array arr
			arr[i] = input.nextInt();
		//End of the for loop
		}
		//Passes arr into the method Sort
		arr = Sort(arr);
		//Start of the for loop initialization of integer i to zero until it is less than the length then adds one
		for(int i = 0; i < length; i ++) {
			//Outputs the value at position i in arr
			System.out.println(arr[i] + " ");
		//End of the for loop
		}
		//Closes the Scanner class
		input.close();
	//End of the main method
	}
	//Start of the public static int [] Sort method taking in a one dimensional array a
	public static int [] Sort(int[] a) {
		//Initialization of the variable temp as type integer
		int temp;
		//Start of the first for loop initialization of integer i to zero until i is less than the length of array a minus one then adds one
		for(int i = 0; i < a.length - 1; i++) {
			//Start of the second for loop initializes integer j to zero adds one until j is less than the length of array a minus one minus i
			for(int j = 0; j < a.length - 1 - i; j++) {
				//Start of the if statement and checks if the value at position j if greater than j plus one
				if(a[j] > a[j + 1]) {
					//If the if statement is true then the value at position j plus one in array a to the variable temp
					temp = a[j + 1];
					//Assigns the value at position j to position j plus one in array a
					a[j + 1] = a[j];
					//Then assigns the value of temp to the position j in array a
					a[j] = temp;
				//End of the if statement
				}
			//End of the second for loop
			}
		//End of the first for loop
		}
		//Returns the array a
		return a;
	//End of the public static int [] Sort method
	}
//End of the public class Main
}