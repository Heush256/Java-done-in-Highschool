import java.io.*;

import java.util.*;

public class Main{ //Start of ObjectsMergeSort 
	
	public static void main(String [] args) throws IOException{ //Start of main section of code
		
		Scanner in = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Unit_2_Assignment_Project_3\\src\\String.txt"));
		
		String list[] = new String[in.nextInt()];
		
		int i = 0;
		
		while (in.hasNext()){ //Start of while loop to assign file into an array
			
			list[i] = in.next();
			
			i++;
			
		}
		
		for(int j = 0; j < list.length; j++) {
			
			System.out.println(list[j]);
			
		}
		
		mergeSort(list, 0, list.length-1); //Calls recursive mergeSort method
		
		System.out.println(Arrays.toString(list));
		
		in.close();
		
	} //End of main
	
	public static void mergeSort (String[] list, int lowIndex, int highIndex) { //Start of mergeSort method
		//Enter your code here
		
		if(lowIndex == highIndex) {
			
			return;
			
		}
		
		int mid = (lowIndex + highIndex) / 2;
		
		mergeSort(list, lowIndex, mid);
		
		mergeSort(list, mid + 1, highIndex);
		
		merge(list, lowIndex, mid, highIndex);
		
		}
	
	public static void merge(String[] list, int lowIndex, int midIndex, int highIndex) { //Start of merge method
		//Enter your code here
		
		String [] L = new String[midIndex - lowIndex +2];
		
		for(int i = lowIndex; i <= midIndex ; i++) {
			
			L[i - lowIndex] = list[i];
			
			System.out.println("L " + list[i] + " = " + i);
			
		}
		
		L[midIndex - lowIndex + 1] = null;
		
		String [] R = new String[highIndex - midIndex +1];
		
		for(int i = midIndex + 1; i <= highIndex; i++) {
			
			R[i - midIndex -1] = list[i];
			
			System.out.println("R " + list[i] + " = " + i);
			
		}
		
		R[highIndex - midIndex] = null;
		
		//R[highIndex - midIndex] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
		
		int i = 0, j = 0;
		
		for(int k = lowIndex; k <= highIndex; k++) {
			
			
			System.out.println("test " + i + "=" + j +  "=" + L.length + "=" + R.length);
			
			if(i < L.length && j < R.length && L[i] != null && R[j] != null) {
			
			if(L[i].compareTo(R[j]) <= 0) {
				
				list[k] = L[i];
				
				i++;
				
			}
			
			else {
				
				list[k] = R[j];
				
				j++;
				
			}
			
		}
			
			else {
				
				if(i < L.length && L[i] != null) {
					
					list[k] = L[i];
					
					i++;
					
				}
				
				else if(j < R.length && R[j] != null){
					
					list[k] = R[j];
					
					j++;
					
				}
				
			}
			
		}
		
		} //End of merge method
	
	} //End of entire class