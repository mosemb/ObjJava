package objectoriented;

public class Battle {
	
	public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
		
		while(true) {
			
			if(getAttactResult(w1,w2).equals("Game Over")) {
				System.out.println("Game Over");
				break; }
			
			if(getAttactResult(w2,w1).equals("Game Over")) {
				System.out.println("Game Over");
				break; }
		}
		
	}
	
	public static String getAttactResult(Warrior wA, Warrior wB) throws InterruptedException {
		int wAattkAmt = wA.attack();
		int wBblkAmt = wB.block();
		int dmgtoWB = wAattkAmt - wBblkAmt;
		
		if (dmgtoWB>0) {
			wB.health = wB.health-dmgtoWB;
		} else {
			dmgtoWB = 0;
		}
		
		System.out.printf("%s Attacks %s and Deals "+" "
				+ " Damage\n",wA.getName(), wB.getName(), dmgtoWB);
		
		System.out.printf("%s Has %d Health\n\n", wB.getName(), wB.health);
		
		Thread.sleep(1500);
		
		if(wB.health<=0) {
			System.out.printf("%s Has died and %s is "+ "Victorious \n ", wB.getName()
					,wA.getName());
			
			return "Game Over";
			
		} else {
			
			return "Fight Again";
			
			
		}
		
		
	}
	
	

}
