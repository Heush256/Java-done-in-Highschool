public class Cats extends Animals{
	
	public String FavToy = "Yarn";
	
	public void PlayWith() {
		
		System.out.println("Yeah " + FavToy);
		
	}
	
	public void walkAround() {
		
		System.out.println(this.getName() + " stalks around");
		
	}
	
	public String getToy() {
		
		return this.FavToy;
		
	}
	
	public Cats(String name, String FavFood, String FavToy) {
		
		super(name, FavFood);
		
		this.FavToy = FavToy;
		
	}
	
}