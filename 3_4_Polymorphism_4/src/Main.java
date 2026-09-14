import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Performance band;
		
		Instrument bandMember1, bandMember2, bandMember3;
		
		Scanner input = new Scanner(System.in);
		
		String performanceChoice;
		
		bandMember1 = assignInstrument();
		
		bandMember2 = assignInstrument();
		
		bandMember3 = assignInstrument();
		
		System.out.println(bandMember1.toString() + " " + bandMember2.toString() + " " + bandMember3.toString() + "\n");
		
		System.out.println("Would you like to hear a S:Solo, a D:Duet, a T:Trio, or L:LeaveWould you like to hear a S:Solo, a D:Duet, a T:Trio, or L:Leave?");
		
		performanceChoice = input.nextLine();
		
		while(!performanceChoice.equalsIgnoreCase("L")) {
			
			if(performanceChoice.equalsIgnoreCase("S")) {
				
				band = new Performance(bandMember1);
				
			}
			
			else if(performanceChoice.equalsIgnoreCase("D")) {
				
				band = new Performance(bandMember1, bandMember2);
				
			}
			
			else {
				
				band = new Performance(bandMember1, bandMember2, bandMember3);
				
			}
			
			band.begin();
			
			System.out.print("\nWould you like to hear a Solo, a Duet, a Trio, or Leave?");
			
			performanceChoice = input.nextLine();
			
		}
		
		input.close();
		
	}
	
	public static Instrument assignInstrument() {
		
		String instrumentChoice;
		
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select an instrument for the band member: V:Vocal, P:Piccolo and C:Clarinet ");
		
		instrumentChoice = input.nextLine();
		
		System.out.println("Enter band members name: ");
		
		name = input.nextLine();
		
		if(instrumentChoice.equalsIgnoreCase("V")) {
			
			return (new Vocal(name));
			
		}
		
		else if(instrumentChoice.equalsIgnoreCase("P")) {
			
			return (new Piccolo(name));
			
		}
		
		else {
			
			return (new Clarinet(name));
			
		}
		
	}
	
}