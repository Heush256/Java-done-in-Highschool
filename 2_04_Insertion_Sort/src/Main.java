public class Main {

	public static void main(String[] args) {
		
		InsertionSort();
		
		int list[] = {12, 11, 13, 5, 6};
		
		InsertionSort ob  = new InsertionSort();
		
		ob.sort(list);
		
		ob.printArray(list);
		
	}
	
	public static void InsertionSort() {
		
		int arr[] = {5, 8, 1, 3, 9, 6};
		
		int j, key, temp;
		
		for(int i = 1; i < arr.length; i++) {
			
			key = arr[i];
			
			j = i - 1;
			
			while(j >= 0 && key < arr[j]) {
				
				temp = arr[j];
				
				arr[j] = arr[j + 1];
				
				arr[j + 1] = temp;
				
				j--;
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
	}

}