public class Tavis implements CharacterInterface{
	
	@Override
	public String getHit() {
		
		String TravisGotHit = "That tickled a bit!";
		
		return TravisGotHit;
		
	}
	
	@Override
	public int Damage(int CurHealth, int Damage) {
		
		int newHealth = CurHealth - Damage;
		
		if(newHealth > 0) {
			
			return newHealth;
			
		}
		else {
			
			return 0;
			
		}
		
	}
	
}