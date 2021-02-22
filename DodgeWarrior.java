package objectoriented;
import java.util.*;


public class DodgeWarrior  extends Warrior {
	double dodgePercentage; 
	Random rand = new Random();

	public DodgeWarrior(String name, int health, int attkMax, 
			int blockMax, double dodgePercentage) {
		super(name, health, attkMax, blockMax);
		// TODO Auto-generated constructor stub
		this.dodgePercentage = dodgePercentage; 
		
	}
	
	public int block() {
		double chance = rand.nextDouble();
		if(chance <=dodgePercentage) {
			System.out.printf("%s Dodges the attach\n\n", this.getName());
			
			return 1000;
			
			
		}else {
			
			return 1 + (int)(Math.random() * 
					((blockMax - 1) + 1));
			
		}
	}
	

}
