import java.util.*;
import java.io.*;
public class _2Reverse {
	
	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		Scanner read = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\Exam_Prep\\src\\Num"));
		
		int size = read.nextInt();
		
		int a [][] = new int[size][size];
		
		int temp;
		
		int o = 0, p = 0;
		
		while(read.hasNext()) {
			
			temp = read.nextInt();
			
			if(p == size) {
				
				o++;
				
				p = 0;
				
			}
			
			a[o][p] = temp;
			
			p++;
			
		}
		
		int result [][] = Reverse2(a);
		
		for(int i = 0; i < result.length; i++) {
			
			for(int j = 0; j < result[i].length; j++) {
				
				System.out.println("Before: " + a[i][j]);
				
				System.out.println("After:" + result[i][j]);
				
			}
			
		}
		
		in.close();
		
		read.close();
		
	}
	
	public static int [][] Reverse2(int [][] b) {
		
		int [][] local = new int[b.length][b.length];
		
		for(int i = b.length - 1, o = 0; i >= 0 && o < b.length; i--, o++) {
			
			for(int j = b.length - 1, p = 0; j >= 0 && p < b.length; j--, p++) {
				
				local[o][p] = b[i][j];
				
			}
			
		}
		
		return local;
		
	}
	
}