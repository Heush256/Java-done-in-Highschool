public class Main {
	public static void main(String [] args) {
		
		String1();
		
		String2();
		
	}
		
	public static void String1() {	
		String str1 = "Wednesday";
		
		String str2 = "October";
		
		if(str2.compareTo(str2) < 0) {
			System.out.println("Your words in order are " + str1 + ", " + str2);
		}
		else
			System.out.println("Your words in order are " + str2 + ", " + str1);
		
	}
	public static void String2() {
		String str1 = "orange";
		
		String str2 = "tang";
		
		if(str1.compareTo(str2) > 0) {
			System.out.println(str1 + " is after " + str2);
		}
		if(str1.compareTo(str2) == 0) {
			System.out.println(str1 + " is similar to " + str2);
		}
		if(str1.compareTo(str2) < 0) {
			System.out.println(str1 + " is before " + str2);
		}
		
	}
}