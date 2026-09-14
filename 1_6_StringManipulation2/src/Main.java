import java.util.*;
public class Main {

	public static void main(String [] args) {
		
		Substring1();
		
		Substring2();
		
		Concatenation();
		
		Replace();
		
		Index1();
		
		Index2();
		
		Trimming();
		
		ScanString();
		
	}
	
	public static void Substring1() {
		
		String string1 = "ABCDEFG";
		
		String string2 = string1.substring(3);
		
		System.out.println(string2);
	}
	
	public static void Substring2() {
		
		String string1 = "ABCDEFG";
		
		String string2 = string1.substring(2, 5);
		
		System.out.println(string2);
	}
	
	public static void Concatenation() {
		
		String string1 = "ABC";
		
		String string2 = "XYZ";
		
		String string3 = string1.concat(string2);
		
		System.out.println(string3);
	}
	
	public static void Replace() {
		
		String string1 = "Missisipi";
		
		String string2 = string1.replace('i', 'e');
		
		System.out.println(string2);
	}
	
	public static void Index1() {
		
		int i1, i2;
		
		String string1 = "Halloween";
		
		i1 = string1.indexOf('a');
		
		i2 = string1.indexOf('a', 4);
		
		if(i1 != -1) {
			System.out.println("Character ‘a’ appears at index " + i1);
		}
		
		//result id returned as -1 if it's out of range
		System.out.println("Character ‘a’ appears at index " + i2);
		
	}
	
	public static void Index2() {
		
		String s1 = "Dr. R. Chang";
		
		int i1 = s1.indexOf("Dr");
		
		System.out.println("Character ‘Dr’ appears at index " + i1);
		
		int i2 = s1.indexOf("Cha", 3);
		
		System.out.println("Character ‘Cha’ appears at index " + i2);
		
	}
	
	public static void Trimming() {
		
		String s1 = "     Today is September 28";
		
		String s2 = s1.trim();
		
		System.out.println(s2);
	}
	
	public static void ScanString() {
		
		String input = "1 fish 2 fish red fish blue fish";
		
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		
		System.out.println(s.nextInt());
		
		System.out.println(s.nextInt());
		
		System.out.println(s.next());
		
		System.out.println(s.next());
		
		s.close();
		
	}
}