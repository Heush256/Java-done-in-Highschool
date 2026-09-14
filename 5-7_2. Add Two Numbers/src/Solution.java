public class Solution {
	
	public static void main(String[] args) {
		
		int l1 []  = {9,9,9,9,9,9,9};
		
		int l2 [] = {9,9,9,9};
		
		int result [] = addTwoNumbers(l1, l2);
		
		for(int i = 0; i < result.length; i++) {
			
			System.out.println("Result array " + result[i]);
			
		}
		
	}
	
	public static int [] addTwoNumbers(int [] l1, int [] l2) {
        
		int [] arr = null;
		
		if(l1.length > l2.length) {
			
			arr = new int [l1.length];
			
		}
		
		else {
			
			arr = new int [l2.length];
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr.length > l1.length) {
				
				if(i > l1.length - 1) {
					
					arr[i] = l2[i];
					
				}
				
				else {
					
					arr[i] = l1[i] + l2[i];
					
				}
				
			}
			
			if(arr.length > l2.length) {
				
				if(i > l2.length - 1) {
					
					arr[i] = l1[i];
					
				}
				
				else {

					arr[i] = l1[i] + l2[i];
					
				}
				
			}
			
		}
		
		int new1 [] = null;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] >= 10) {
				
				if(arr[arr.length - 1] >= 10) {
					
					new1 = new int [arr.length + 1];
					
				}
				
				else {
					
				arr[i] -= 10;
				
				arr[i + 1] += 1;
				
				}
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			new1[i] = arr[i];
			
		}
		
			
		if(new1[new1.length - 2] >= 10) {
			
			new1[new1.length - 2] -= 10;
			
			new1[new1.length - 1] += 1;
			
		}
				
		return new1;
		
    }
	
}