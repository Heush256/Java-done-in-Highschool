public abstract class _10FarmAnimal {
	
	private int age;	
	
	protected boolean healthy = true;
	
	public _10FarmAnimal(int age){
		
		this.age = age;
		
	}
	
	public abstract void feed();
	
	public String getStatus(){
		
		String result ="This animal is ";
		
		if(healthy){
			
			result += "healthy.";
			
		}
		
		else {
			
			result += "unhealthy.";
			
		}
		
		return result;
		
	}
	
}