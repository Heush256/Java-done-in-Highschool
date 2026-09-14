import java.util.*;
import java.io.*;
public class _6InsertionSort {
	
	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\_6insertList"));
		
		int size = reader.nextInt();
		
		int p = 0;
		
		int [] array = new int[size];
		
		while(reader.hasNext()) {
			
			int temp = reader.nextInt();
			
			array[p] = temp;
			
			p++;
			
		}
		
		int [] result = Sort(array);
		
		System.out.println("Here is sorted array");
		
		for(int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
			
		}
		
		reader.close();
		
	}
	
	public static int [] Sort(int [] a) {
		
		for(int i = 1; i < a.length; i++) {
			
			int key = a[i];
			
			int j = i - 1;
			
			while(j >= 0 && a[j] > key) {
				
				a[j + 1] = a[j];
				
				j = j - 1;
				
			}
			
			a[j + 1] = key;
			
		}
		
		return a;
		
	}
	
}