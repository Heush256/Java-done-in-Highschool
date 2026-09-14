public class Main {
	
	public static void main(String[] args) {
		
		BubbleSort();
		
		BubbleSort ob = new BubbleSort();
		
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		
		ob.bubbleSort(arr);
		
		System.out.println("Sorted array");
		
		ob.printArray(arr);
		
	}
	
	public static void BubbleSort() {
		
		int list[] = {5, 8, 1, 6, 9, 2};
		
		int temp = 0;
		
		for(int i = 0; i < list.length - 1; i++) {
			
			for(int j = 0; j < list.length - 1 - i; j++) {
				
				if(list[j] > list[j + 1]) {
					
					temp = list[j];
					
					list[j] = list[j +1];
					
					list[j + 1] = temp;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < list.length; i++) {
			
			System.out.print(list[i] + " ");
			
			System.out.println("");
			
		}
		
	}
	
}