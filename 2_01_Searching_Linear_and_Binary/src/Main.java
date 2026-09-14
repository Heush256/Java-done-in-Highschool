public class Main {

	public static void main(String[] args) {
		
		LinearArray1();
		
		LinearArray2();
		
		LinearArray3();
		
		LinearArray4();
		
		BinarySearch ob = new BinarySearch();
		
		int arr [] = {2, 3, 4, 10, 40};
		
		int n = arr.length;
		
		int x = 10;
		
		int result = ob.binarySearch(arr, 0, n - 1, x);
		
		if(result == -1) {
			
			System.out.println("Element is not present");
			
		}
		
		else {
			System.out.println("Element is found at index: " + result);
			
		}
		
	}
	
	public static void LinearArray1() {
		
		int[] values = {50, 25, 75, 100, 42, 64, 86};
		
		int searchValue = 55;
		
		int pos = 0;
		
		boolean found = false;
		
		while(pos < values.length && !found) {
			
		if(values[pos] == searchValue) {
			
			found = true;
			
		}
		
		else {
			
			pos++;
			
		}
		
	}
		if(found) {
			
			System.out.println("Found at position: " + pos);
			
		}
		
		else {
			
			System.out.println("Not found");
			
		}
		
	}
	
	public static void LinearArray2() {
		
		int list [] = {2, 3, 4, 10, 40};
		
		int x = 10;
		
		int result = -1;
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i] == x) {
				
				result = i;
				
			}
			
		}
		
		if(result == -1) {
			
			System.out.println("Element is not present in array");
			
		}
		
		else {
			
			System.out.println("Element is present in array at index " + result);
			
		}
		
	}
	
	public static void LinearArray3() {
		
		String [] array = {"Kevin", "David", "Devin"};
		
		String searchValue = "Kevin";
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].equals(searchValue)) {
				
				System.out.println("The name is at index: " + i);
				
			}
			
		}
		
	}
	
	public static void LinearArray4() {
		
		int arr [] = {10, 20, 30, 40, 50, 60, 70};
		
		int key = 60;
		
		int last = arr.length - 1;
		
		int first = 0;
		
		while(first <= last) {
			
			int mid = (first + last) / 2;
			
			if(arr[mid] == key) {
				
				System.out.println("Element is found at index: " + mid);
				
				break;
				
			}
			
			else if(key < arr[mid]) {
				
				last = mid - 1;
				
			}
			
			else {
				
				first = mid + 1;
				
			}
			
		}
		
		if(first > last) {
			
			System.out.println("Element is not found!");
			
		}
		
	}
	
}