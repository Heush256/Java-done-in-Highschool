public class Performance {
	
	private String arrangement;
	
	private Instrument solo;
	
	private Instrument duet_1, duet_2;
	
	private Instrument trio_1, trio_2, trio_3;
	
	public Performance(Instrument s) {
		
		solo = s;
		
		arrangement = solo.makeSound();
		
	}
	
	public Performance(Instrument d1, Instrument d2) {
		
		duet_1 = d1;
		
		duet_2 = d2;
		
		arrangement = duet_1.makeSound() + duet_2.makeSound();
		
	}
	
	public Performance(Instrument t1, Instrument t2, Instrument t3) {
		
		trio_1 = t1;
		
		trio_2 = t2;
		
		trio_3 = t3;
		
		arrangement = trio_1.makeSound() + trio_2.makeSound() + trio_3.makeSound();
		
	}
	
	public void begin() {
		
		System.out.println(arrangement);
		
	}
	
	public String toString() {
		
		String program = "This performance includes ";
		
		program += arrangement;
		
		return (program);
		
	}
	
}