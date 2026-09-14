public class Guest {
	
	private double height;
	
	public Guest(double h) {
		
		height = h;
		
	}
	
	public double getHeight(){
		
		return height;
		
	}
	
	public boolean equals(Object g) {
		
		Guest tempGuest = (Guest) g;
		
		if(height == tempGuest.getHeight()) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
}