public class Animals {
	
	private String name = "Animal";
	
	public String FavFood = "Food";
	
	protected final void changeName(String newName) {
		
		this.name = newName;
		
	}
	
	protected final String getName() {
		
		return this.name;
		
	}
	
	public void eatStuff() {
		
		System.out.println("Yum " + FavFood);
		
	}
	
	public void walkAround() {
		
		System.out.println(this.name + " walks around");
		
	}
	
	public Animals() {
		
		
		
	}
	
	public Animals(String name, String FavFood) {
		
		this.changeName(name);
		
		this.FavFood = FavFood;
		
	}
	
}