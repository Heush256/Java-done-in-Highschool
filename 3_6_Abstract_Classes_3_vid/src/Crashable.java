public abstract class Crashable {
	
	boolean CarDrivable = true;
	
	public void YouCrashed() {
		
		this.CarDrivable = false;
		
	}
	
	public abstract void setCarStrength(int CarStrength);
	
	public abstract int getCarStrength();
	
}