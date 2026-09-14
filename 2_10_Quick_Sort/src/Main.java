import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		
		int [] A = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5 , 9, 1, 0, 9};
		
		System.out.println(Arrays.toString(A));
		
		qs.quickSort(A);
		
		System.out.println(Arrays.toString(A));
		
	}
	
}