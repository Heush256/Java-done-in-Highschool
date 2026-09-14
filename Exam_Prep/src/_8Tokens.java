import java.util.*;
public class _8Tokens {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("first name/last name/phone number/email address");
		
		while(st.hasMoreTokens()) {
			//Seems to be a formating thing??? ig that's it for the tokenizer?
			System.out.println(st.nextToken("/"));
			
		}
		
	}
	
}