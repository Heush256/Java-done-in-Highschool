import java.util.*;
class Main{
	
	public static void main(String[]args) {
		
		//int [] nums = new int[10];
		
		Car [] cars = new Car[3];
		
		//cars[0] = new Car();
		
		Scanner in = new Scanner(System.in);
		
		String temp;
		
		for(int i = 0; i < cars.length; i++) {
			
			System.out.println("The car model please: ");
			
			temp = in.next();
			
			cars[i] = new Car();
			
			cars[i].setModel(temp);
			
		}
		
		for(int i = 0; i < cars.length; i++) {
			
			System.out.println("Model: " + cars[i].getModel());
			
		}
		
		in.close();
		
	}
	
}