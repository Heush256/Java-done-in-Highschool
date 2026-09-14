import java.io.*;
import java.util.*;
public class _4SelectionSort {
	
	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\_4InsertList"));
		
		int size = reader.nextInt();
		
		int array [] = new int[size];
		
		int l = 0;
		
		while(reader.hasNext()) {
			
			int temp = reader.nextInt();
			
			array[l] = temp;
			
			l++;
			
		}
		
		int [] result = Sort(array);
		
		System.out.println("Here is sorted array");
		
		for(int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
			
		}
		
		reader.close();
		
	}
	
	public static int [] Sort(int [] a) {
		
		int temp;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					
					temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
				}
				
			}
			
		}
		
		return a;
		
	}
	
}