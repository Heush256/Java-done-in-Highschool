public class Main {

	public static void main(String[] args) {
		
		int result, num = 10;
		
		result = Factorial(num);
		
		System.out.println("Factorial of " + num + " is " + result);
		
		int result2, num2 = 9;
		
		result2 = Fib(num2);
		
		System.out.println("Fibonacci of " + num2 + " is " + result2);
		
		showRecursion(2);
		
		int result3 = Sum(3);
		
		System.out.println("Total of 3 + 2 + 1 is " + result3);
		
	}
	
	public static int Factorial(int num) {
		
		if(num == 1) {
			
			return 1;
			
		}
		
		else {
			
			return num * Factorial(num - 1);
			
		}
		
	}
	
	public static int Fib(int num2) {
		
		if(num2 <= 1) {
			
			return num2;
			
		}
		
		else {
			
			return Fib(num2 - 1) + Fib(num2 - 2);
			
		}
		
	}
	
	public static void showRecursion(int num) {
		//Ask what is this for?
		System.out.println("Entering method. num = " + num);
		
		if(num > 1) {
			
			showRecursion(num - 1);
			
		}
		
		System.out.println("Leaving method. num = " + num);
		
	}
	
	public static int Sum(int num) {
		
		if(num == 1) {
			
			return num;
			
		}
		
		else {
			
			return num + Sum(num - 1);
			
		}
		
	}
	
}