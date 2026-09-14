import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a [][] = {{1,3,5,7},
					{10,11,16,20}};
		
		System.out.println("Enter your target number: ");
		
		int target = in.nextInt();
		
		boolean flag = searchMatrix(a, target);
		
		if(flag == true) {
			
			System.out.println("true");
			
		}
		
		else {
			
			System.out.println("false");
			
		}
		
		in.close();
		
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		if(target <= matrix[0][matrix.length - 1]) {
			
			for(int i = 0; i < matrix[0].length; i++) {
				
				if(target == matrix[0][i]) {
					
					return true;
					
				}
				
			}
			
		}
		
		if(target >= matrix[1][0]) {
			
			for(int i = 0; i < matrix[1].length; i++) {
				
				if(target == matrix[1][i]) {
					
					return true;
					
				}
				
			}
			
		}
			
			return false;
		
    }
	
}