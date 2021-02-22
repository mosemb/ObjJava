package objectoriented;

public class WarriorGame {
	
	public static void main(String[]args) throws InterruptedException {
		Warrior thor = new Warrior("Thor", 800,130,40);
		//Warrior loki = new Warrior("Loki", 800,130,40);
		Warrior loki = new DodgeWarrior("Loki", 800,85,40,0.25);
		
		
		Battle.startFight(thor, loki);
		
	}

}
