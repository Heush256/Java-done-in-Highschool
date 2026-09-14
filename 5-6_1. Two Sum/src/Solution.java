import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nums [] = {2,7,11,15};
		
		System.out.println("Enter the sum that any 2 numbers in the array add up to: ");
		
		int target = in.nextInt();
		
		
		
		int [] result = twoSum(nums, target);
		
		for(int i = 0; i < 2; i++) {
		
		System.out.println("Result " + result[i]);
		
		}
		
		in.close();
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
		int [] re = new int [2];
		
		int diff;
		
		for(int i = 0; i < nums.length; i++) {
			
			int sum = nums[i];
			
			for(int j = 1; j < nums.length; j++) {
			
			diff = target - sum;
			
			if(diff == nums[j]) {
				
				re[0] = i;
				
				re[1] = j;
				
				return re;
				
			}
			
		}
			
		}
		return re;
		
    }

}