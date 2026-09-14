public class Clarinet extends WoodWind{
	
	public Clarinet(String clarinetist) {
		
		super(clarinetist);
		
	}
	
	public String makeSound() {
		
		return ("squak");
		
	}
	
	public String toString() {
		
		return (super.getMusician() + " plays " + makeSound() + ".");
		
	}
	
}