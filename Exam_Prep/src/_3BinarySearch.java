import java.util.*;
import java.io.*;
public class _3BinarySearch {
	
	public static void main (String[]args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\_3BinarList"));
		
		int size = reader.nextInt();
		
		int array [] = new int [size];
		
		int temp, count = 0;
		
		while(reader.hasNext()) {
			
			temp = reader.nextInt();
			
			array[count] = temp;
			
			count++;
			
		}
		
		System.out.println("Enter a number you want to find: ");
		
		int find = in.nextInt();
		
		boolean flag = Find(array, find);
		
		if(flag) {
			
			System.out.println(find + " was found in the array!");
			
		}
		
		else {
			
			System.out.println(find + " was not found in the array!");
			
		}
		
		in.close();
		
	}
	
	public static boolean Find(int [] a, int b) {
		
		int first = 0, last = a.length - 1;
		
		
		
		if(a.length > 0 && a.length <= 3) {
			
			for(int i = first; i == last;) {
				
				if(a[i] == b) {
					
					return true;
				}
				
				else {
					return false;
					
				}
				
			}
			
		}
		
		while(first <= last) {
			
			int mid = (first + last) / 2;
			
			if(a[mid] == b) {
				
				return true;
				
			}
			
			else if(b < a[mid]) {
				
				last = mid - 1;
				
			}
			
			else {
				
				first = mid + 1;
				
			}
			
		}
		
		return false;
		
	}
	
}