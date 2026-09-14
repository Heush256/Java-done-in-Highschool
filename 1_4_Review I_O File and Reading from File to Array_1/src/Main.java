import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\1_4_Review I_O File and Reading from File to Array_1\\src\\numbers.txt"));
		
		Scanner reader2 = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\1_4_Review I_O File and Reading from File to Array_1\\src\\numbers.txt"));
		
		double number, sum = 0;
		
		int count = 0;
		
		while(reader.hasNext()) {
			
			number = reader.nextDouble();
			
			System.out.println("Numebr: " + number);
			
			sum += number;
			
			count++;
			
			System.out.println("Sum: " + sum + ", Counter: " + count);
			
		}
		
		double num;
		
		while(reader2.hasNext()) {
			
			num = reader2.nextDouble();
			
			if(num > 50.0) {
				
				System.out.println(num);
				
			}
		}
		
		System.out.println("End of program");
		
		reader.close();
		
		reader2.close();
		
	}

}