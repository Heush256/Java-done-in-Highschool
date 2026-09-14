import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Array1();
		
		Array2();
		
		Array3();
		
		Exercises();
		
		Cube1();
		
		Cube2();
		
		Occur();
		
		Appear();
		
		FirstLocation();
		
		Compare();
		
		ParrArray();
		
		D2Array();
		
		GenD2Array();
		
		SumRow();
		
	}
	
	public static void Array1() {
		
		int bucky [] = new int [10];
		
		bucky [0] = 87;
		
		bucky [1] = 543;
		
		bucky [9] = 65;
		
		System.out.println("Array1 " + bucky[9]);
		
	}
	
	public static void Array2() {
		
		int bucky [] = {2, 4, 5, 7, 9};
		
		System.out.println("Array2 " + bucky[2]);
		
	}
	
	public static void Array3() {
		
		String name [] = new String [10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The size of your name array is " + name.length);
		
		for(int i = 0; i <= name.length - 1; i++) {
			
			System.out.println("Enter name # " + (i + 1));
			
			name[i] = input.next();
			
		}
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.println("Entered name # " + (i + 1) + " is " + name[i]);
			
		}
		
	}
	
	public static void Exercises() {
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the number of students in the class: ");
		
		int stu = input2.nextInt();
		
		String name [] = new String [stu];
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.println("Enter the name of student # " + (i + 1));
			
			name [i] = input2.next();
			
		}
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.println("Student # " + (i + 1) + " is " + name[i]);
		}
		
		input2.close();
		
	}
	
	public static void Cube1() {
		
		int cube [] = new int [10];
		
		for(int i = 0; i < cube.length; i++) {
			
			cube[i] = (i * i * i);
			
			System.out.println(cube[i]);
			
		}
		
	}
	
	public static void Cube2() {
		
		double [] cubes = new double [10];
		
		for(int i = 0; i < 10; i++) {
			
			cubes [i] = Math.pow(i, 3);
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print(cubes[i] + " ");
			
		}
		
	}
	
	public static void Occur() {
		
		int [] someArray = {1, 2, 3, 4, 5, 6, 7};
		
		int sum = 0;
		
		for(int i = 0; i < someArray.length; i++) {
			
			sum += someArray[i];
			
			System.out.println("Sum of Array is " + sum);
			
		}
		
	}
	
	public static void Appear() {
		
		int [ ] someArray = {1,2,1,1,2,1,2};
		
		int x = 1, count = 0;
		
		for(int i = 0; i < someArray.length; i++) {
			
			if(someArray[i] == x) {
				count++;
			}
			
		}
		
		System.out.println("The number of times " + x + " occurs is " + count);
		
	}
	
	public static void FirstLocation() {
		
		int [ ] someArray = {1,2,1,1,2,1,2};
		
		boolean found = false;
		
		int x = 2;
		
		for(int i = 0; i < someArray.length; i++) {
			
			if(someArray[i] == x) {
				found = true;
				break;
			}
			
		}
		
		if(found) {
			
			System.out.println("Found");
			
		}
		
		else
			
			System.out.println("Not found");
		
	}
	
	public static void Compare() {
		
		int [ ] someArray = {1,2,1,1,2,1,2};
		
		int x = 2, loc = -1;
		
		for(int i = 0; i < someArray.length; i++) {
			
			if(someArray[i] == x) {
				loc = i;
				break;
			}
			
		}
		
		if(loc == -1) {
			
			System.out.println("Not found");
			
		}
		
		else
			
			System.out.println(x + " found at index " + loc);
		
	}
	
	public static void ParrArray() {
		
		String [] name = {"bob", "mary", "tom", "david"};
		
		int [] age = {32, 21, 43, 34 ,45};
		
		String searchname = "tom";
		
		int personAge = -1;
		
		for(int i = 0; i < name.length; i++) {
			if(searchname.equals(name[i])) {
				personAge = age[i];
				break;
			}
		}
		
		if(personAge == -1) {
			
			System.out.println(searchname + " not found");
			
		}
		
		else
			
			System.out.println("The age is " + personAge);
		
	}
	
public static void D2Array() {
		
		int [] [] table = {{1, 2, 3, 4},
						   {5, 7, 7, 8},
						  {9, 10, 11, 12}};
		
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				sum += table[i][j];
			}
		}
		
		System.out.println("Sum of all the numbers in the table is " + sum);
		
	}
	
	public static void GenD2Array() {
		
		int [] [] table = {{1, 2, 3, 4},
						   {5, 7, 7, 8},
						   {9, 10, 11, 12}};
		
		int sum = 0;
		
		for(int i = 0; i < table.length; i++) {
			
			for(int j = 0; j < table[i].length; j++) {
				
				sum += table[i][j];
				
			}
			
		}
		
		System.out.println("Sum of all the numbers in the table is " + sum);
		
	}
	
	public static void SumRow() {
		
		int [] [] table = {{1, 2, 3, 4},
						   {5, 7, 7, 8},
						   {9, 10, 11, 12}};
		
		int [] rowSum = new int[3];
		
		for(int i = 0; i < table.length; i++) {
			
			for(int j = 0; j < table[i].length; j++) {
				
				rowSum[i] = table[i][j];
				
			}
			
		}
		
		for(int i = 0; i < rowSum.length; i++) {
			
			System.out.println("Sum of all the numbers in row " + i + " is " + rowSum[i]);
			
		}
		
	}

}