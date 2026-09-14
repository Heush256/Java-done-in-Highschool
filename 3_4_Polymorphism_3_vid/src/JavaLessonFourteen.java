public class JavaLessonFourteen {
	
	public static void main(String[] args) {
		
		Animals genaricAnimal = new Animals();
		
		System.out.println(genaricAnimal.getName());
		
		System.out.println(genaricAnimal.FavFood);
		
		Cats Morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println();
		
		System.out.println(Morris.getName());
		
		System.out.println(Morris.FavFood);
		
		System.out.println(Morris.FavToy);
		
		Animals Tabby = new Cats("Tabby", "Sallmon", "Ball");
		
		AcceptAnimal(Tabby);
		
	}
	
	public static void AcceptAnimal(Animals RandAnimal) {
		
		System.out.println(RandAnimal.getName());
		
		System.out.println(RandAnimal.FavFood);
		
		System.out.println();
		
		RandAnimal.walkAround();
		
		Cats tempCat = (Cats) RandAnimal;
		
		System.out.println(tempCat.FavToy);
		
		System.out.println(((Cats)RandAnimal).FavToy);
		
		if(RandAnimal instanceof Animals) {
			
			System.out.println(RandAnimal.getName() + " is a Cat");
			
		}
		
	}
	
}