import java.util.*;
import java.io.*;
public class _5BubbleSort {
	
	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\_5BubbleList"));
		
		int size = reader.nextInt();
		
		int p = 0;
		
		int array [] = new int[size];
		
		while(reader.hasNext()) {
			
			int temp = reader.nextInt();
			
			array[p] = temp;
			
			p++;
			
		}
		
		//int [] result = Sort(array);
		
		System.out.println("Here is sorted array");
		
		/*for(int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
			
		}*/
		
		int temp;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 1; j < array.length; j++) {
			
			if(array[j - 1] > array[j]) {
				
				temp = array[j - 1];
				
				array[j - 1] = array[j];
				
				array[j] = temp;
				
				
				
			}
			
			System.out.println(array[i]);
			
		}
			
		}
		
		for(int i = 0; i < array.length; i++) {
		
		System.out.println(array[i]);
		
		}
		
		reader.close();
		
	}
	
	/*public static int [] Sort(int [] a) {
		
		int temp;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 1; j < a.length; j++) {
			
			if(a[j - 1] > a[j]) {
				
				temp = a[j - 1];
				
				a[j - 1] = a[j];
				
				a[j] = temp;
				
			}
			
		}
			
		}
		
		return a;
		
	}*/
	
}