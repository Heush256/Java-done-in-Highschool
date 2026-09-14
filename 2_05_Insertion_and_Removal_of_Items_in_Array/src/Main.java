import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		InserSort();
		
		Remove();
		
		String [] words = {"apple", "banana", "grapes"};
		
		System.out.println("Original version: ");
		
		printWords(words);
		
		words = addWords(words);
		
		System.out.println("New version: ");
		
		printWords(words);
		
		int a[] = {1, 2, 4, 5, 6, 7};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What Index would you like to insert into the array ");
		
		int insert_index = input.nextInt();
		
		System.out.println("What number would you like to input into that position ");
		
		int insert_number = input.nextInt();
		
		int b[] = new int[a.length + 1];
		
		b = Insert(a, insert_index, insert_number);
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]);
			
		}
		
		System.out.println("");
		
		System.out.println("Array length of Array B is " + b.length);
		
		//To remove a number
		
		int c[] = {1, 2, 4, 5, 6, 7};
		
		System.out.println("What Index would you like to remove from the array ");
		
		int remove_index = input.nextInt();
		
		int d[] = new int[c.length - 1];
		
		d = Remove(c, remove_index);
		
		for(int i = 0; i < d.length; i++) {
			
			System.out.print(d[i]);
			
		}
		
		System.out.println("");
		
		System.out.println("Array length of Array D is " + d.length);
		
		input.close();
		
	}
	
	public static void InserSort() {
		
		int ori [] = {3, 4, 5, 6, 7, 8, 9, 0, 0, 0};
		
		int size = 7;
		
		int pos = 3;
		
		for(int i = size; i > pos; i--) {
			
			ori [i] = ori[i - 1];
			
		}
		
		ori[pos] = 0;
		
		for(int i = 0; i < ori.length; i++) {
			
			System.out.print(ori[i] + " ");
			
		}
		
		System.out.println("");
		
	}
	
	public static void Remove() {
		
		int myNum[] = new int[10];
		
		myNum[0] = 5;
		myNum[1] = 9;
		myNum[2] = 15;
		myNum[3] = 2;
		myNum[4] = 1;
		
		int logicalsize = 5;
		
		int target = 2;
		
		for(int i = target; i < logicalsize - 1; i ++) {
			
			myNum[i] = myNum[i + 1];
			
		}
		
		myNum[logicalsize - 1] = 0;
		
		logicalsize--;
		
		for(int i = 0; i < myNum.length; i++) {
			
			System.out.print(myNum[i] + " ");
			
		}
		
		System.out.println("");
		
	}
	
	public static String [] addWords(String [] words) {
		
		String [] moreWords = new String [words.length + 1];
		
		for(int i = 0; i < words.length; i ++) {
			
			moreWords[i] = words[i];
			
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("New word: ");
		
		moreWords[moreWords.length - 1] = in.nextLine();
		
		return moreWords;
		
	}
	
	public static void printWords(String [] words) {
		
		for(int i = 0; i < words.length; i++) {
			
			System.out.println((i + 1) + ") " + words[i]);
			
		}
		
	}
	
	public static int [] Insert(int [] a, int in_index, int in_num) {
		
		int c [] = new int[a.length + 1];
		
		for(int i = 0, j = 0; i < c.length; i++) {
			
			if(i == in_index) {
				
				c[i] = in_num;
				
			}
			
			else {
				
				c[i] = a[j];
				
				j++;
				
			}
			
		}
		
		return c;
		
	}
	
	public static int [] Remove(int [] a, int r_index) {
		
		int c [] = new int[a.length - 1];
		
		for(int i = 0, j = 0; i < c.length; i++) {
			
			if(i >= r_index) {
				
				c[i] = a[j + 1];
				
			}
			
			else {
				
				c[i] = a[j];
				
			}
			
			j++;
			
		}
		
		return c;
		
	}
	
}