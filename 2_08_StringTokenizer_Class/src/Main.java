import java.util.*;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Tokenizer1();
		
		Tokenizer2();
		
		Tokenizer3();
		
	}
	
	public static void Tokenizer1() {
		
		StringTokenizer st = new StringTokenizer("this is a test");
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		
	}
	
	public static void Tokenizer2() {
		
		StringTokenizer str = new StringTokenizer("first name/last name/phone number/email adress");
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken("/"));
			
		}
		
	}
	
	public static void Tokenizer3() {
		
		String s = "Hello World";
		
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		
		String s2 = "Hello*World";
		
		StringTokenizer str = new StringTokenizer(s2, "*");
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken());
			
		}
		
	}
	
}