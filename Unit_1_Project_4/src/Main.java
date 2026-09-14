/*Kevin Toromani
 * Mr. G Seow
 * Project #4: Password Generator Software Specifications
 * ICS4U1-01
 * Thursday, October 17, 2024
 */
//java is the package, util is the subsection, * is all of the classes
import java.util.*;
//Start of the public class Main class
public class Main {
	//Start of the public static void main method
	public static void main(String[]args) {
		//Calls the Scanner class and and reads import form the user
		Scanner input = new Scanner(System.in);
		//Initialization of the values f_name, m_name, l_name, f_col, and p_num as type String
		String f_name, m_name, l_name, f_col, p_num;
		//Initialization of the values shortf, shortm, shortl, shortfc, and shortpn as type String and are empty
		String shortf = "", shortm = "", shortl = "", shortfc = "", shortpn = "";
		//Initialization of the variable contin to 'y' as tye character
		char contin = 'y';
		//Start of while loop and checks if the value of contin is equal to 'y' or 'Y'
		while(contin == 'y' || contin == 'Y') {
		//Asks the user for their first name
		System.out.print("Enter your first name: ");
		//Passes the object input into Check1 method and assigns the result to the variable f_name
		f_name = Check1(input);
		//Asks the user for their middle name
		System.out.print("Enter your middle name: ");
		//Passes the object input into Check2 method and assigns the result to the variable m_name
		m_name = Check2(input);
		//Asks the user for their last name
		System.out.print("Enter your last name: ");
		//Passes the object input into Check3 method and assigns the result to the variable l_name
		l_name = Check3(input);
		//Asks the user for their favorite colour
		System.out.print("Enter your favorite colour: ");
		//Passes the object input into Check4 method and assigns the result to the variable f_col
		f_col = Check4(input);
		//Asks the user for their phone number
		System.out.print("Enter your phone number: ");
		//Passes the object input into Check5 method and assigns the result to the variable p_num
		p_num = Check5(input);
		//Passes the variables f_name and shortf into Sub1 method and assigns the result to the variable shortf
		shortf = Sub1(f_name, shortf);
		//Passes the variables m_name and shortm into Sub1 method and assigns the result to the variable shortm
		shortm = Sub2(m_name, shortm);
		//Passes the variables l_name and shortl into Sub1 method and assigns the result to the variable shortl
		shortl = Sub3(l_name, shortl);
		//Passes the variables f_col and shortfc into Sub1 method and assigns the result to the variable shortfc
		shortfc = Sub4(f_col, shortfc);
		//Passes the variables p_num and shortpn into Sub1 method and assigns the result to the variable shortpn
		shortpn = Sub5(p_num, shortpn);
		//Tells the user what their password generated is
		System.out.println("Your password generated is " + shortf + shortm + shortl + shortfc + shortpn);
		//Asks the user if they want to continue and to input y or n
		System.out.println("Do your wish to continue? (y or n) ");
		//Passes the variable contin into Continue method and assigns the result to the variable contin
		contin = Continue(input);
		//End of the while loop
		}
		//Closes the Scanner class
		input.close();
	//End of the public static void main method
	}
	//Start of the public static String Check1 method, taking in the object input
	public static String Check1(Scanner input) {
		//Assigns the input from the user to the variable f_name as type String
		String f_name = input.next();
		//Start of while loop and checks if the length of the String the user inputted is less than 2
		while(f_name.length() < 2) {
			//While the while loop is true then it asks the user to input again
			System.out.println("Invalid entry, try again: ");
			//Assigns the new input to f_name
			f_name = input.next();
		//End of while loop
		}
		//Returns f_name
		return f_name;
	//End of the public static Sting Check1 method
	}
	//Start of the public static String Check2 method, taking in the object input
	public static String Check2(Scanner input) {
		//Assigns the input from the user to the variable m_name as type String
		String m_name = input.next();
		//Start of while loop and checks if the length of the String the user inputted is less than 2
		while(m_name.length() < 2) {
			//While the while loop is true then it asks the user to input again
			System.out.println("Invalid entry, try again: ");
			//Assigns the new input to m_name
			m_name = input.next();
		//End of while loop
		}
		//Returns m_name
		return m_name;
		//End of the public static Sting Check2 method
	}
	//Start of the public static String Check3 method, taking in the object input
	public static String Check3(Scanner input) {
		//Assigns the input from the user to the variable l_name as type String
		String l_name = input.next();
		//Start of while loop and checks if the length of the String the user inputted is less than 2
		while(l_name.length() < 2) {
			//While the while loop is true then it asks the user to input again
			System.out.println("Invalid entry, try again: ");
			//Assigns the new input to l_name
			l_name = input.next();
		//End of while loop
		}
		//Returns l_name
		return l_name;
	//End of the public static Sting Check3 method
	}
	//Start of the public static String Check4 method, taking in the object input
	public static String Check4(Scanner input) {
		//Assigns the input from the user to the variable f_col as type String
		String f_col = input.next();
		//Start of while loop and checks if the length of the String the user inputted is less than 2
		while(f_col.length() < 2) {
			//While the while loop is true then it asks the user to input again
			System.out.println("Invalid entry, try again: ");
			//Assigns the new input to f_col
			f_col = input.next();
		//End of while loop
		}
		//Returns f_col
		return f_col;
	//End of the public static Sting Check4 method
	}
	//Start of the public static String Check5 method, taking in the object input
	public static String Check5(Scanner input) {
		//Assigns the input from the user to the variable p__num as type String
		String p_num = input.next();
		//Start of while loop and checks if the length of the String the user inputted is less than 2
		while(p_num.length() < 2) {
			//While the while loop is true then it asks the user to input again
			System.out.println("Invalid entry, try again: ");
			//Assigns the new input to p_num
			p_num = input.next();
		//End of while loop
		}
		//Returns p_num
		return p_num;
	//End of the public static Sting Check5 method
	}
	//Start of the public static String Sub1 method, taking in the variables f_name and shortf
	public static String Sub1(String f_name, String shortf) {
		//Start of the if statement and checks if the length of what the user inputted is greater than two
		if(f_name.length() > 2) {
			//If the if statement is true then the substring of 1 to 3 for f_name is taken and assigned to shortf
			shortf = f_name.substring(1, 3);
			//Returns shortf
			return shortf;
		//End of the if statement
		}
		//If the if statement is false
		else 
			//Then the substring of 0 to 2 for f_name is taken and assigned to shortf
			shortf = f_name.substring(0, 2);
			//Returns shortf
			return shortf;
	//End of the public static String Sub1 method
	}
	//Start of the public static String Sub2 method, taking in the variables m_name and shortm
	public static String Sub2(String m_name, String shortm) {
		//Start of the if statement and checks if the length of what the user inputted is greater than two
		if(m_name.length() > 2) {
			//If the if statement is true then the substring of 1 to 3 for m_name is taken and assigned to shortm
			shortm = m_name.substring(1, 3);
			//Returns shortm
			return shortm;
		//End of the if statement
		}
		//If the if statement is false
		else
			//Then the substring of 0 to 2 for m_name is taken and assigned to shortm
			shortm = m_name.substring(0, 2);
		//Returns shortm
		return shortm;
	//End of the public static String Sub2 method
	}
	//Start of the public static String Sub2 method, taking in the variables l_name and shortl
	public static String Sub3(String l_name, String shortl) {
		//Start of the if statement and checks if the length of what the user inputted is greater than two
		if(l_name.length() > 2) {
			//If the if statement is true then the substring of 1 to 3 for l_name is taken and assigned to shortl
			shortl = l_name.substring(1, 3);
			//Returns shortl
			return shortl;
		//End of the if statement
		}
		//If the if statement is false
		else
			//Then the substring of 0 to 2 for l_name is taken and assigned to shortl
			shortl = l_name.substring(0, 2);
		//Returns shortl
		return shortl;
	//End of the public static String Sub3 method
	}
	//Start of the public static String Sub4 method, taking in the variables f_col and shortfc
	public static String Sub4(String f_col, String shortfc) {
		//Start of the if statement and checks if the length of what the user inputted is greater than two
		if(f_col.length() > 2) {
			//If the if statement is true then the substring of 1 to 3 for f_col is taken and assigned to shortfc
			shortfc = f_col.substring(1, 3);
			//Returns shortfc
			return shortfc;
		//End of the if statement
		}
		//If the if statement is false
		else
			//Then the substring of 0 to 2 for f_col is taken and assigned to shortfc
			shortfc = f_col.substring(0, 2);
		//Returns shortfc
		return shortfc;
	//End of the public static String Sub4 method
	}
	//Start of the public static String Sub5 method, taking in the variables p_num and shortpn
	public static String Sub5(String p_num, String shortpn) {
		//Start of the if statement and checks if the length of what the user inputted is greater than two
		if(p_num.length() > 2) {
			//If the if statement is true then the substring of 1 to 3 for p_num is taken and assigned to shortpn
			shortpn = p_num.substring(1, 3);
			//Returns shortpn
			return shortpn;
		//End of the if statement
		}
		//If the if statement is false
		else
			//Then the substring of 0 to 2 for p_num is taken and assigned to shortpn
			shortpn = p_num.substring(0, 2);
		//Returns shortpn
		return shortpn;
	//End of the public static String Sub5 method
	}
	//Start of the public static char Continue method, taking in the object input
	public static char Continue(Scanner input) {
		//Assigns the value of contin to o as type char
		char contin = 0;
		//Assigns the input from the user to the variable contin as type char
		contin = input.next().charAt(0);
		//Start of the while loop checking if contin does not equal 'y', 'Y', 'n', and 'N'
		while(contin != 'y' && contin != 'Y' && contin != 'n' && contin != 'N') {
			//While the while loop is true then this statement is outputted
			System.out.println("Invalid entry, enter agin if you want to continue (y or n): ");
			//Assigns the new input to contin
			contin = input.next().charAt(0);
		//End of the while loop
		}
		//Returns contin
		return contin;
	//End of the public static char Continue method
	}
//End of the public class Main file
}