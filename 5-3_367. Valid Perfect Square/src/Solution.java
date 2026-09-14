import java.util.*;
public class Solution {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your magic number: ");
		
		int num = in.nextInt();
		
		boolean flag = isPerfectSquare(num);
		
		if(flag == true) {
			
			System.out.println("true");
			
		}
		
		else {
			
			System.out.println("Flase");
			
		}
		
		in.close();
		
	}
	
    public static boolean isPerfectSquare(int num) {
    	
    	double check = Math.sqrt(num);
    	
    	boolean flag = false;
    	
    	if(((int)(check) * (int)(check)) == num) {
    		
    		flag = true;
    		
    		return flag;
    		
    	}
    	
		return flag;
        
    }
}