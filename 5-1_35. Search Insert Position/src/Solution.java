import java.util.*;
class Solution {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);

        int nums [] = {-1,0,3,5,9,12};

            System.out.println("Enter your target");

            int target = input.nextInt();
            
            int result = search(nums, target);
            
            if(result >= 0) {
            	
            	System.out.println(target + " exists in nums and its index is " + result);
            	
            }
            
            else {
            	
            	System.out.println(target + " does not exist in nums");
            	
            }
            
            input.close();
		
	}
    public static int search(int[] nums, int target) {
    	
    	int mid = nums.length / 2;
    	
        
        	
        	if(target == nums[mid]) {
        		
        		return mid;
        		
        	}

        	else if(target < nums[mid]){
        		
        		for(int i = 0; i < nums.length; i++) {
        			
        			for(int j = 1; j < nums.length; j++) {
        		
        			if(target == nums[i]) {
        				
        				return i ;
        				
        			}
        			
        			else if(target > nums[i] && target < nums[j]) {
        				
        				return j;
        				
        			}
        			
        			else if(target < nums[i]) {
        				
        				return i;
        				
        			}
                
        		}
        			
        		}

            }
        	
        	else if(target > nums[mid]) {
        		
        		for(int i = 0; i < nums.length; i++) {
        			
        			for(int j = 1; j < nums.length; j++) {
            		
        			if(target == nums[i]) {
        				
        				return i ;
        				
        			}
        			
        			else if(target > nums[i] && target < nums[j]) {
        				
        				return j;
        				
        			}
        			
        			else if(target > nums[nums.length - 1]) {
        				
        				return nums.length;
        				
        			}
                
        		}
        			
        		}
        		
        	}
        	
            return -1;

        

    }
}