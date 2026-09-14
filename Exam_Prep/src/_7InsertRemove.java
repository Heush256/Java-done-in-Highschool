import java.io.*;
import java.util.*;
public class _7InsertRemove {
	
	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\_7InsertRemoveList"));
		
		Scanner in = new Scanner(System.in);
		
		int size = reader.nextInt();
		
		int p = 0;
		
		int [] array = new int[size];
		
		while(reader.hasNext()) {
			
			int temp = reader.nextInt();
			
			array[p] = temp;
			
			p++;
			
		}
		
		System.out.println("This is the list so far: ");
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		System.out.println("Do you wish to remove or add anything? (r or a or n): ");
		
		String ans = in.next();
		
		if(ans.equalsIgnoreCase("r")) {
			
			System.out.println("At which position greater than 0 and less than 5 would you like to remove?: ");
			
			int point = in.nextInt();
			
			int result [] = Remove(array, point);
			
			System.out.println("This is what the array looks like now: ");
			
			for(int i = 0; i < result.length; i++) {
				
				System.out.println(result[i]);
				
			}
			
		}
		
		else if(ans.equalsIgnoreCase("a")) {
			
			System.out.println("At which position greater than 0 and less than 5 would you live to add?: ");
			
			int point = in.nextInt();
			
			System.out.println("What number do you wish to add?:");
			
			int num = in.nextInt();
			
			int result [] = Add(array, point, num);
			
			System.out.println("This is what the array looks like now: ");
			
			for(int i = 0; i < result.length; i++) {
				
				System.out.println(result[i]);
				
			}
			
		}
		
		else {
			
			reader.close();
			
			in.close();
			
		}
		
	}
	
	public static int [] Remove(int [] a, int p){
		
		int local[] = new int[a.length - 1];
		
		for(int i = 0; i < local.length; i++) {
			
			if(i >= p) {
				
				local[i] = a[i + 1];
				
			}
			
			else {
				
				local[i] = a[i];
				
			}
			
		}
		
		return local;
	}
	
	public static int [] Add(int [] a, int p, int num){
		
		int local [] = new int[a.length + 1];
		
		for(int i = 0; i < a.length; i++) {
			
			if(i == p) {
				
				local[i] = num;
				
			}
			
			else if(i >= p) {
				
				local[i + 1] = a[i];
				
			}
			
			else {
				
				local[i] = a[i];
				
			}
			
		}
		
		return local;
	}
	
}