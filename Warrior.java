package objectoriented;

public class Warrior {
	
	protected String name = "Warrior";
	public int health = 0; 
	public int attkMax = 0; 
	public int blockMax = 0; 
	
	public Warrior(String name, int health, int attkMax, int blockMax) {
		this.setName(name);
		this.health = health;
		this.attkMax = attkMax;
		this.blockMax = blockMax;
		
		
	}
	
	// Because name is protected we need to access it privately
	public void  setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// Model what happens when a warrior attacks
		// and blocks
		public int attack() {
			return 1 + (int)(Math.random() * 
					((attkMax - 1) + 1));
		}
		
		public int block() {
			return 1 + (int)(Math.random() * 
					((blockMax - 1) + 1));
		}
	
	//public int attack() {
	//	return 1+ (int) Math.random()* ((attkMax-1)+1);
	//}
	
	//public int block() {
	//	return 1+ (int) Math.random()* ((blockMax-1)+1);
	//}
	
	
	
	
	
	
	
}
