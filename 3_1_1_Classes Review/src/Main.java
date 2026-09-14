public class Main {

	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		
		Class1 d = new Class1();
		
		System.out.println(c1.x);
		
		System.out.println(c1.chars);
		
		System.out.println(d.x);
		
		c1.printHi();
		
		d.printHi();
		
		Class2 c2 = new Class2();
		
		System.out.println(c2.y);
		
	}
	
}