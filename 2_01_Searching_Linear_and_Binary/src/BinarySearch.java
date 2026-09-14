class BinarySearch {
	
	int binarySearch(int arr[], int i, int r, int x) {
		
		if(r >= i) {
			
			int mid = i + (r - i) / 2;
		
			if(arr[mid] == x) 
				
				return mid;
			
			if(arr[mid] > x ) 
				
				return binarySearch(arr, i, mid - 1, x);
				
				return binarySearch(arr, mid + 1, r, x);
			
		}
		
			return -1;
			
	}
	
}