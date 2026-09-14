public class Main {
	public static void main(String [] args) {
		
		Length1();
		
		Length2();
		
		Lowercase();
		
		Equals1();
		
		Equals2();
		
	}
		
		
	public static void Length1() {	
		String str1 = "The rain in Spain falls mainly on the plain.";
		
		
		System.out.println(str1.length());
		
		
	}
	
	public static void Length2() {
		
		String string1 = "example";
		
		System.out.println(string1.charAt(1));
		
		char Mychar = string1.charAt(1);
		
		System.out.println(Mychar);
		
	}
	
	public static void Lowercase() {
		
		String word1 = "apple", word2 = word1.toUpperCase(), word3 = word2.toLowerCase();
		
		System.out.println(word2);
		
		System.out.println(word3);
		
		
	}
	
	public static void Equals1() {
		
		String s1 = "hi", s2 = "hi";
		
		if(s1.equals(s2)) {
			
			System.out.println("They are the same");
			
		}
		
		else
			System.out.println("They are not the same");
		
	}
	
	public static void Equals2() {
		
		String s1 = "HI", s2 = "hi";
		
		if(s1.equalsIgnoreCase(s2)) {
			
			System.out.println("They are the same");
			
		}
		
		else
			System.out.println("They are not the same");
		
	}
	
}