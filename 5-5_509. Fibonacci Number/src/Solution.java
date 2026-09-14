import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the n value for fibb: ");
		
		int n = in.nextInt();
		
		int result = fib(n);
		
		System.out.println("Result is " + result);
		
		in.close();
		
	}
	
	public static int fib(int n) {
        
		if(n == 1) {
			
			return 1;
			
		}
		
		if(n == 0) {
			
			return 0;
			
		}
		
		else {
			
			return fib(n - 1) + fib(n - 2);
			
		}
		
    }

}