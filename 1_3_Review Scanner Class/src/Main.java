import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int integer;
		long longInteger;
		float realNumber;
		double doubleReal;
		String string1, string2;
		
		System.out.println("Enter an integer, a long integer, "

                       + "a floating-point ");

    System.out.println("number, another floating-point number, "

                       + "and a string.");

    System.out.println("Separate each with a blank or return.");
    
    integer = in.nextInt();
    
    longInteger = in.nextLong();
    
    realNumber = in.nextFloat();
    
    doubleReal = in.nextDouble();
    
    string1 = in.nextLine();
    
    System.out.println("Now enter another value. ");
    
    string2 = in.nextLine();
    
    System.out.println("Here is what you entered: ");
    
    System.out.println(integer + " " + longInteger + " " + realNumber +

            " " + doubleReal + " " + string1 +

            " and " + string2);

	}

}
