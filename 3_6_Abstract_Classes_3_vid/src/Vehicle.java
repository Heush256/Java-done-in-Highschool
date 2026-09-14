public class Vehicle extends Crashable implements Drivable {
	
	int NumOfWheels = 2;
	
	double TheSpeed = 0;
	
	int CarStrength = 0;
	
	@Override
	public int getWheel() {
		
		return this.NumOfWheels;
		
	}
	
	@Override
	public void setWheels(int NumWheels) {
		
		this.NumOfWheels = NumWheels;
		
	}
	
	@Override
	public double getSpeed() {
		
		return this.TheSpeed;
		
	}
	
	@Override
	public void setSpeed(double Speed) {
		
		this.TheSpeed = Speed;
		
	}
	
	public Vehicle(int wheels, double speed) {
		
		this.NumOfWheels = wheels;
		
		this.TheSpeed = speed;
		
	}
	
	public void setCarStrength(int CarStrength) {
		
		this.CarStrength = CarStrength;
		
	}
	
	public int getCarStrength() {
		
		return this.CarStrength;
		
	}
	
}