import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		
		int [] table = {1, 2, 3, 4, 5, 7, 7, 8,9, 10, 11, 12};
		
		System.out.println("Sum of the numbers in the table is " + Sum(table));
		
		int [] table2 = {1, 2, 3, 4, 5, 7, 7, 8,9, 10, 11, 12};
		
		int location;
		
		location = Search(table2, 3);
		
		System.out.println("The search value is located at " + location);
		
		int [][] table3 = {{1, 2, 3},
                		   {4, 5, 7}, 
                		   {7, 8,9}, 
                		   {10, 11, 12}};
		
		int [] result_rowsum;
		
		result_rowsum = sumRows(table3);
		
		for(int i = 0; i < result_rowsum.length; i++) {
			
			int row = i + 1;
			
			System.out.println("Row sum of rowRow sum of row " + row + " is " + result_rowsum[i]);
			
		}
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\1_1_Arrays_2\\averages.txt"));
		
		double number;
		
		while(reader.hasNext()) {
			
			number = reader.nextDouble();
			
			if(number > 50.0) {
				
				System.out.println(number);
				
			}
			
		}
		
		System.out.println("End of program");
		
		reader.close();

	}
	
	public static int Sum(int [] table) {
		
		int result = 0;
		
		for(int i = 0; i < table.length; i++) {
			
			result += table[i];
			
		}
		
		return result;
		
	}
	
	public static int Search(int [] a, int searchValue) {
		
		int location = -1;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == searchValue) {
				location = i;
				break;
			}
		}
		
		return location;
		
	}
	
	public static int [] sumRows(int [][] a) {
		
		int [] result_rowsum = new int [a.length];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				result_rowsum [i] += a[i][j];
				
			}
		}
		
		return result_rowsum;
		
	}
	
}
