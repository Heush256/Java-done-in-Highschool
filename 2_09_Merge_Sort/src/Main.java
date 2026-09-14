public class Main {

	public static void main(String[] args) {
		
		int list[] = {17, 87, 6, 22, 41, 3, 13, 54};
		
		System.out.println("Given Array");
		
		for(int i = 0; i < list.length; i ++) {
			
			System.out.print(list[i] + " ");
			
		}
		
		mergeSort(list, 0, list.length - 1);
		
		System.out.println("\nSorted array");
		
		for(int i = 0; i < list.length; i++) {
			
			System.out.print(list[i] + " ");
			
		}
		
	}
	
	public static void mergeSort(int list [], int lowindex, int highindex) {
		
		if(lowindex == highindex) {
			
			return;
			
		}
		
		else {
			
			int midindex = (lowindex + highindex) / 2;
			
			mergeSort(list, lowindex, midindex);
			
			mergeSort(list, midindex + 1, highindex);
			
			merge(list, lowindex, midindex, highindex);
			
		}
		
	}
	
	public static void merge(int list [], int lowindex, int midindex, int highindex) {
		
		int L[] = new int[midindex - lowindex + 2];
		
		for(int i = lowindex; i <= midindex; i++) {
			
			L[i - lowindex] = list[i];
			
		}
		
		L[midindex - lowindex + 1] = 999;
		
		int R[] = new int[highindex - midindex + 1];
		
		for(int i = midindex + 1; i <= highindex; i++) {
			
			R[i - midindex - 1] = list[i];
			
		}
		
		R[highindex - midindex] = 999;
		
		int i = 0, j = 0;
		
		for(int k = lowindex; k <= highindex; k++) {
			
			if(L[i] <= R[j]) {
				
				list[k] = L[i];
				
				i++;
				
			}
			
			else {
				
				list[k] = R[j];
				
				j++;
				
			}
			
		}
		
	}
	
}