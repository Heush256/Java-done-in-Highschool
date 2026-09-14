/*Kevin Toromani
 * Mr. G Seow
 * Project #3: Merge sort
 * ICS4U1-01
 * Thursday, November 21, 2024
 */
import java.io.*;

import java.util.*;

public class ObjectsMergeSort{ //Start of ObjectsMergeSort 
	
	public static void main(String [] args) throws IOException{ //Start of main section of code
		
		Scanner in = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Unit_2_Assignment_Project_3\\src\\String.txt"));
		
		String list[] = new String[in.nextInt()];
		
		int i = 0;
		
		while (in.hasNext()){ //Start of while loop to assign file into an array
			
			list[i] = in.next();
			
			i++;
			
		}
		
		mergeSort(list, 0, list.length-1); //Calls recursive mergeSort method
		
		System.out.println(Arrays.toString(list));
		
		in.close();
		
	} //End of main
	
	public static void mergeSort (String[] list, int lowIndex, int highIndex) { //Start of mergeSort method
		//Enter your code here
		//If the condition that the lowIndex is equal to the highIndex is true then it runs
		if(lowIndex == highIndex) {
			//returns
			return;
		//End of if statement
		}
		//Initialization if mid of type integer and takes lowIndex + highIndex then divides them by two
		int mid = (lowIndex + highIndex) / 2;
		//Calls on the method mergeSort and passes list, lowIndex and mid
		mergeSort(list, lowIndex, mid);
		//Calls on the method mergeSort and passes list, mid + 1 and highIndex
		mergeSort(list, mid + 1, highIndex);
		//Calls on the method merge and passes list, lowIndex, mid and highIndex
		merge(list, lowIndex, mid, highIndex);
		//End of the public static void mergeSort method
		}
	
	public static void merge(String[] list, int lowIndex, int midIndex, int highIndex) { //Start of merge method
		//Enter your code here
		//Initialization of the String array L to the midIndex minus the lowIndex plus two
		String [] L = new String[midIndex - lowIndex + 2];
		//Start of the for loop initializing i assigns it to lowIndex, adds one until it is less than or equal to midIndex
		for(int i = lowIndex; i <= midIndex; i++) {
			//Sets the String in array L at position i minus lowIndex to a String at position i in list
			L[i - lowIndex] = list[i];
		//End of for loop
		}
		//Sets the String in array L at position midIndex minus lowIndex plus one to null
		L[midIndex - lowIndex + 1] = null;
		//Initialization of the String array R to the highIndex minus the midIndex plus one
		String [] R = new String[highIndex - midIndex + 1];
		//Start of the for loop initializing i assigns it to midIndex plus one, adds one until it is less than or equal to highIndex
		for(int i = midIndex + 1; i <= highIndex; i++) {
			//Sets the String in array R at position i minus lowIndex minus one to a String at position i in list
			R[i - midIndex - 1] = list[i];
		//End of for loop
		}
		//Sets the String in array R at position highIndex minus midIndex to null
		R[highIndex - midIndex] = null;
		//Initialization of i and j as type integer and sets them to zero
		int i = 0, j = 0;
		//Start of the for loop initializing k assigns it to lowIndex, adds one until it is less than or equal to highIndex
		for(int k = lowIndex; k <= highIndex; k++) {
			//Start of the first if statement checks if the String at position i in array L and at position j in array R is not equal to null
			if(i < L.length && j < R.length && L[i] != null && R[j] != null) {
				//The second if statement checks if the value of the comparing the Strings at position i in array L and j in array R is less than or equal to zero
				if(L[i].compareTo(R[j]) <= 0) {
					//If the if statement is true then it assigns the String at position i in array L to position k in array list
					list[k] = L[i];
					//increases i by one
					i++;
				//End of the second if statement
				}
				//Start of the else statement
				else {
					//If the if statement is false then the String at position j in array R is assigned to position k in array list
					list[k] = R[j];
					//Increases j by one
					j++;
				//End of else statement
				}
			//End of the first if statement
			}
			//Else if the if statement if false
			else {
				//Start of the if statement and checks if i is less than the length of array L and if the position in array L at i is not equal to null
				if(i < L.length && L[i] != null) {
					//If the if statement is true then it assigns the String at position i in array L to position k in array list
					list[k] = L[i];
					//increases i by one
					i++;
				//End of the if statement
				}
				//Start of the if statement and checks if j is less than the length of array R and if the position in array R at j is not equal to null
				else if(j < R.length && R[j] != null) {
					//If the if statement is false then the String at position j in array R is assigned to position k in array list
					list[k] = R[j];
					//Increases j by one
					j++;
				//End of the else if statement
				}
			//End of the else statement
			}
		//End of the for loop
		}
		
	} //End of merge method
	
} //End of entire class