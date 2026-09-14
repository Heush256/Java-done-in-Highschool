import java.util.*;
public class _11Palindrone {
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String user = "", test = "";
		System.out.println("Input your string: ");
		user = in.next();
		for(int i = user.length() - 1; i >= 0; i--){
		test += user.charAt(i);
		}
		if(user.equalsIgnoreCase(test)){
		System.out.println("This is a palindrome!");
		}
		else{
		System.out.println("This is NOT a palindrome!");
		}
		in.close();
		}

	
}