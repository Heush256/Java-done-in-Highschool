public class Proof {
	
	public static void main(String [] args) {
		
		int [][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int [] neww = new int[9];
		
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				
				neww[count] = a[i][j];
				
				count++;
				
			}
			
		}
		
		for(int i = 0; i < neww.length; i++) {
			
			System.out.print(neww[i] + " ");
			
		}
		
	}
	
	
}