import java.util.*;
import java.io.*;
public class _1StudentMain {
	
	public static void main(String[] args) throws IOException{
		
		_1Students [] stu = new _1Students[3];
		
		Scanner in = new Scanner(System.in);
		
		String temp;
		
		for(int i = 0; i < stu.length; i++) {
			
			System.out.println("Enter name of student: ");
			
			temp = in.next();
			
			stu[i] = new _1Students();
			
			stu[i].setStu(temp);
			
		}
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println("Student " + (i + 1) + "'s name: " + stu[i].getStu());
		}
		
		in.close();
		
	}
	
}