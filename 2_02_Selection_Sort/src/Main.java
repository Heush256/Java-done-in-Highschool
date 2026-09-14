public class Main {
	public static void main(String[] args) {
		
		Sort1();
		
		SelectionSort ob = new SelectionSort();
		
		int arr [] = {64, 25, 12, 22, 11};
		
		ob.sort(arr);
		
		System.out.println("Sorted array");
		
		ob.printArray(arr);
		
		Sort2();
		
	}
	
	public static void Sort1() {
		
		int [] list = {7, 8, 5, 4, 9, 2};
		
		int minValue, minIndex, temp = 0;
		
		for(int i = 0; i < list.length; i++) {
			
			minValue = list[i];
			
			minIndex = i;
			
			for(int j = i; j < list.length; j++) {
				
				if(minValue > list[j]) {
					
					minValue = list[j];
					
					minIndex = j;
					
				}
				
				if(minValue < list[i]) {
					
					temp = list[i];
					
					list[i] = list[minIndex];
					
					list[minIndex] = temp;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < list.length; i++) {
			
			System.out.println(list[i]);
			
		}
		
	}
	
	public static void Sort2() {
		
		
		
	}

}