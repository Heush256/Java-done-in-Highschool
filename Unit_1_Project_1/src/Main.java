/*Kevin Toromani
 * Mr. G Seow
 * Project #1: A magic square
 * ICS4U1-01
 * Thursday, October 17, 2024
 */
//java is the package, io is the subsection, * is all of the classes
import java.io.*;
//java is the package, util id the subsection, * is all of the classes
import java.util.*;
//Start of the public class Main class
public class Main {
	//Start of the public static void main method, that can read files through the "throws IOEception"
	public static void main(String[] args) throws IOException{
		//Calls the Scanner class and creates a new object called reader, used to read values from the file magic1.txt
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Unit_1_Project_1\\src\\magic1.txt"));
		//Initialization of the variable size, as type integer, and assigns the first integer from the file to size
		int size = reader.nextInt();
		//Initialization of the variable num as type integer
		int num;
		//Initialization of the two dimensional array squ as type integer, with the dimensions of size as its parameters
		int [][] squ = new int [size][size];
		//Initialization of the variables r and c at zero as type integer
		int r = 0, c = 0;
		//Start of the while loop that runs if there are still integers in the file "magic1.txt" to assign to the variable num
		while(reader.hasNext()) {
			//Numbers from the file "magic.txt" are assigned to num
			num = reader.nextInt();
			//Passes array squ, integers num, r and c into method Array, and assigns the result to the two dimensional array squ
			squ = Array(squ, num, r, c);
			//Initialization of the array ind, passes size, r and c into method Size and assigns the result to ind
			int [] ind = Size(size, r, c);
			//Sets the value of r at the position of ind at zero
			r = ind[0];
			//Sets the value of c at the position of ind at one
			c = ind[1];
		//End of the while loop
		}
		//Initialization of the array row and the size of it is set to the variable size
		int row [] = new int [size];
		//Initialization of the array col and the size of it is set to the variable size
		int col [] = new int[size];
		//Initialization of the variable diag1 and diag2 to zero as a type integer
		int diag1 = 0, diag2 = 0;
		//Passes the two-D array squ, one-D array row and integer size into method Pro1, and assigns the result to the array row
		row = Pro1(size, squ, row);
		//Passes the two-D array squ, one-D array col and integer size into method Pro2, and assigns the result to the array col
		col = Pro2(size, squ, col);
		//Passes the two-D array squ, integers size and diag1 into method Pro3, and assigns the result to the variable diag1
		diag1 = Pro3(size, squ, diag1);
		//Passes the two-D array squ, integers size and diag2 into method Pro4, and assigns the result to the variable diag2
		diag2 = Pro4(size, squ, diag2);
		//Initialization of magic1 and magic2 as true as a type boolean
		boolean magic1 = true, magic2 = true;
		//Passes diag1, size, one-D arrays row and col, magic1 and magic2 into Test, and assigns the result to the boolean magic1
		magic1 = Test(diag1, size, row, col, magic1, magic2);
		//Start of the if statement and checks to see if magic1, magic2 is true and diag1 is equal to diag2
		if(magic1 && magic2 && diag1 == diag2) {
			//If the if statement is true then this statement is outputted and the value of diag1 is outputted too
			System.out.println("This is a magic square, the constant is: " + diag1);
		//End of the if statement
		}
		//Start of the else statement
		else {
			//This statement id outputted if the if statement is false
			System.out.println("This is not a magic square");
		//End of the else statement
		}
		//Closes the Scanner class
		reader.close();
	//End of the public static void main method
	}
		//Start of the public static int [] Size method, taking in size, r and c as a type integer
		public static int [] Size (int size, int r, int c) {
			//Initialization of the array ret with a size of 2;
			int [] ret = new int[2];
			//Start of the if statement and checks if the value of c is equal to the size minus one
			if(c == size-1) {
				//If the if statement id true then r is incremented by 1
				r++;
				//The variable c is set to zero
				c = 0;
				//The value of ret at position zero is set to r
				ret[0] = r;
				//The value of ret at position one is set to c
				ret[1] = c;
				//The value of ret is returned
				return ret;
			//End of if statment
			}
			//Start of the else statement
			else {
				//If the if statement is false then c is incremented by one
				c++;
				//The value of ret at position zero is set to r
				ret[0] = r;
				//The value of ret at position one is set to c
				ret[1] = c;
				//Returns the value of ret
				return ret;
			//End of the else statement
			}
	//End of the public static int [] Size method
	}
		//Start of the public static int [][] Array method, taking in two-D array squ, num, r and c as type integer
		public static int [][] Array(int [][] squ, int num, int r, int c){
			//Sets the value at position r, c to the value of num
			squ [r][c] = num;
			//Returns squ array
			return squ;
		//End of the public static int [][] Array method
		}
		//Start of the public static int [] Pro1 method, taking in size, two-D array squ and one-D array row as type integer
		public static int [] Pro1(int size, int [][] squ, int [] row) {
			//Start of the first for loop, initializing i to zero, checks if i is less than size, and increments i by one
			for(int i = 0; i < size; i++) {
				//Start of the second for loop, initializing j to zero, checks if j is less than size, and increments j by one
				for(int j = 0; j < size; j++) {
					//Assigns the value of squ at position i, j to row at position i
					row[i] += squ [i][j];
				//End for second for loop
				}
			//End of first for loop
			}
			//Returns row array
			return row;
		//End of the public static int [] Pro1 method
		}
		//Start of the public static int [] Pro2 method, taking in size, two-D array squ and one-D array col as type integer
		public static int [] Pro2(int size, int [][] squ, int [] col) {
			//Start of the first for loop, initializing j to zero, checks if j is less than size, and increments j by one
			for(int j = 0; j < size; j++) {
				//Start of the second for loop, initializing i to zero, checks if i is less than size, and increments i by one
				for(int i = 0; i < size; i++) {
					////Assigns the value of squ at position i, j to col at position j
					col[j] += squ [i][j];
				//End of second for loop
				}
			//End of first for loop
			}
			//Returns col array
			return col;
		//End of the public static int [] Pro2 method
		}
		//Start of the public static int Pro3 method, taking in size, two-D array squ and diag1 as type integer
		public static int Pro3(int size, int [][] squ, int diag1) {
			//Start of the first for loop, initializing i to zero, checks if i is less than size, and increments i by one
			for(int i = 0; i < size; i++) {
				//Start of the second for loop, initializing j to zero, checks if j is less than size, and increments j by one
				for(int j = 0; j < size; j++) {
					//Start of if statement and checks if the value of i is equal to j
					if(i == j) {
						//If the if statement is true then the value at position i, j is assigns to diag1
						diag1 += squ [i][j];
					//End of if statement
					}
				//End of second for loop
				}
			//End of first for loop
			}
			//Returns diag1
			return diag1;
		//End of the public static int Pro3 method
		}
		//Start of the public static int Pro4 method, taking in size, two-D array squ and diag2 as type integer
		public static int Pro4(int size, int [][] squ, int diag2) {
			//Start of the first for loop, initializing i to size minus one, checks if i gerater of equal to zero, and deincrements i by one
			for(int i = size - 1; i >= 0; i--) {
				//Start of the second for loop, initializing j to zero, checks if j is less than size, and increments j by one
				for(int j = 0; j < size; j++) {
					//Start of if statement and checks to see if size minus one minus i is equal to the value of j
					if(size - 1- i == j) {
						//If the if statement if true then the value at position i, j is assigns to diag2
						diag2 += squ [i][j];
					//End of the if statement
					}
				//End of second for loop
				}
			//End of first for loop
			}
			//Returns diag2
			return diag2;
		//End of the public static int Pro4 method
		}
		//Start of the public static boolean Test method, taking in diag1, size, one-D array row, one-D array col as type integer, and magic1 and magic2 and type boolean
		public static boolean Test(int diag1, int size, int [] row, int [] col, boolean magic1, boolean magic2) {
			//Start of the for loop, initializing i to zero, checks if i is less than size, and increments i by one
			for(int i = 0; i < size; i++) {
				//Start of the first if statement and checks if the value of diag1 is not equal to the value of row at position i
				if(diag1 != row[i]) {
					//If the if statement if true then magic1 is set to false
					magic1 = false;
					//Returns magic1
					return magic1;
				//End of the first if statement
				}
				//Start of the second if statement and checks if the value of diag1 is not equal to the value of col at position i
				if(diag1 != col[i]) {
					//If the if statement if true then magic2 is set to false
					magic2 = false;
					//Returns magic2
					return magic2;
				//End of the second if statement
				}
			//End of the for loop
			}
			//Defaults returns true if the if statements are false
			return true;
		//End of the public static boolean test method
		}
//End of the public class Main file
}