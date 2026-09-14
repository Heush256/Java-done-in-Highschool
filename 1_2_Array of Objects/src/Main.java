import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Student [] studentArray = new Student[3];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < studentArray.length; i++) {
			
			System.out.println("Enter student " + i + "'s name: ");
			
			String name = in.next();
			
			System.out.println("Enter student " + i + " ’s test 1 mark: ");
			
			int mark = in.nextInt();
			
			studentArray[i] = new Student(name, mark, 0, 0);
			
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println("The high score for student " + i + " is ");
			System.out.println(studentArray[i].getHighScore());
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println("What score do you wish to display for student " + i);
			int score = in.nextInt();
			System.out.println(studentArray[i].getScore(score));
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println("What test score do you wish to input for student " + i);
			int test = in.nextInt();
			System.out.println("What score do you wish to input for student " + i);
			int score = in.nextInt();
			studentArray[i].setScore(test, score);
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		
	}

}
