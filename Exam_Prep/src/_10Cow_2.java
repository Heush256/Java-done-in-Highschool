public class _10Cow_2 extends _10FarmAnimal{
	
	private int timeFed = 0;
	
	public _10Cow_2(int age){super(age); }
	
	public void feed(){
		
		timeFed++;
		
		if(timeFed > 3){
			
			healthy = false;
			
		}
		
	}
	
}