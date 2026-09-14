/*Kevin Toromani
 * Mr. G Seow
 * Project #3: A magic square
 * ICS4U1-01
 * Thursday, October 17, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//java is the package, io is the subsection, * is all of the classes
import java.io.*;
//Start of the public class Main class
public class Main {
	//Start of the public static void main method, that can read files through "throws IOEception"
	public static void main(String[] args) throws IOException{
		//Calls the Scanner class and creates a new object called reader, used to read values from list.txt
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Unit_1_Project_3\\src\\list.txt"));
		//Initialization of the variable length, and assigns the first integer to length
		int length = reader.nextInt();
		//Initialization of num, po, t, all to zero, and max to one
		int num = 0, po = 0, t = 0, max = 1;
		//Initialization of the one-D array count, its size is set to the value of length
		int [] count = new int [length];
		//Initialization of the one-D array app, its size is set to the value of length
		int [] app = new int [length];
		//Initialization of the one-D array result, its size is set to the value of length
		int [] result = new int[length];
		//Passes the object reader, variable num, one-D array count and po into the Arary1 method and assigns the result to the one-D array count
		count = Array1(reader, num, count, po);
		//Start of the for loop, initializing i to zero, checks if i is less than length, and increments i by one
		for(int i = 0; i < length; i++) {
			//Prints out the values of count at position i
			System.out.println(count[i]);
		//End of for loop
		}
		//Passes the variable length, one-D array count and one-D array app into the Arary2 method and assigns the result to the one-D array app
		app = Array2(app, count, length);
		//Passes the variable length, one-D array app and max into the Arary3 method and assigns the result to the varuable max
		max = Array3(length, app, max);
		//Passes the variable length, max and t, one-D array app, result and count into the Arary4 method and assigns the result to the one-D array result
		result = Array4(length, max, app, result, count, t);
		//Outputs the word "Mode:"
		System.out.print("Mode: ");
			//Start of the for loop, initializing i to zero, checks if i is less than length, and increments i by one
			for(int i = 0; i < length; i++) {
				//Start of the if statement and checks if the variable in position i of the one-D array result is not equal to zero
				if(result[i] != 0) {
				//Outputs the value of the result at position i
				System.out.print(result[i] + " ");
				//End of if statement
				}
			//End of for loop
			}
		//Closes the Scanner class
		reader.close();
	//End of the public static void main method
	}
	//Start of the public static int [] Array1 method, taking in the object reader, integer num, one-D array count and po
	public static int [] Array1(Scanner reader, int num, int [] count, int po) {
		//Start of the while loop that runs if there are still integers in the file "list.txt" to assign to the variable num
		while(reader.hasNext()) {
			//Numbers from the file "list.txt" are assigned to num
			num = reader.nextInt();
			//Assigns the value of num in the one-D array count at position po
			count[po] = num;
			//Increments po by one
			po++;
		//End of the while loop
		}
		//Returns count
		return count;
	//End of the public static int [] Array1 method
	}
	//Start of the public static int [] Array2 method, taking in one-D array app and count, and variable length as type integer
	public static int [] Array2(int [] app, int [] count, int length) {
		//Start of the first for loop, initializing i to zero, checks if i is less than length, and increments i by one
		for(int i = 0; i < length; i++) {
			//Start of the second for loop, initializing j to zero, checks if j is less than length, and increments j by one
			for(int j = 0; j < length; j++) {
				//Start of if statement and checks if the vaule of i is not equal to the value of j and if the value of count at position i is equal to count at position j
				if(i != j && count[i] == count[j]) {
					//Increases the one-D array at position i by one
					app[i]++;
				//End of teh if statement
				}
			//End of the second for loop
			}
		//End ofr the first for loop
		}
		//Returns app
		return app;
	//End of the public static int [] Array2 method
	}
	//Start of the public static int Array3 method, taking in length, one-D and max as type ingteger
	public static int Array3(int length, int [] app, int max) {
		//Start of the for loop, initializing i to zero, checks if i is less than length, and increments i by one
		for(int i = 1; i < length; i++) {
			//Start of the if statement and checks if the value of the variable max is less then the value of the one-D array app at position i
			if(max < app[i]) {
				//If the if statement is true, then the value of app at position i is assigns to max
				max = app[i];
			//End of the if statement
			}
		//End of the for loop
		}
		//Returns max
		return max;
	//End of the public static int Array3 method
	}
	//Start of the public static int [] Array4 method, taking in length, max, one-D app, result and count, and t as type integer
	public static int [] Array4(int length, int max, int [] app, int [] result, int [] count, int t) {
		//Initialization of the variable found of type boolean to false
		boolean found = false;
		//Start of the first for loop, initializing i to zero, checks if i is less than length, and increments i by one
		for(int i = 0; i < length; i++) {
			//Start of the first if statement and checks if the value of max is equal to the value of one-D array app at position i
			if(max == app[i]) {
				//If the if statement is true then found is set to false
				found = false;
				//Start of the second for loop, initializing z to zero, checks if z is less than length, and increments z by one
				for(int z = 0; z < length; z++) {
					//Start of second if statement and checks if the value of one-D array result at position z is equal to the value of one-D array app at position i
					if(result[z] == count[i]) {
						//If the if statement is true then found is set to true
						found = true;
						//Ends the if statement of the if statement is true
						break;
					//End of the second if statement
					}
				//End of the second for loop
				}
				//Start of the third if statement and checks if the value of found is false
				if(!found) {
					//If the if statement is true then the value of the one-D array result at position t is set to the value of the one-D array count at position i
					result[t] = count[i];
					//Increments t by one
					t++;
				//End of the third if statement
				}
			//End of the first if statement
			}
		//End of the first for loop
		}
		//Returns result
		return result;
	//End of the public static ubt [] Array4 method
	}
//End of the public class Main file
}