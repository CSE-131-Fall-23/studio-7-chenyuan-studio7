package studio7;

public class Die {
	private int sides;
	
	public Die(int initSides) {
		sides = initSides;
	}
	
	public int land() {
		return (int) (Math.random() * (sides - 1) + 1);
	}
	
	public String toStringDie() {
		return 
	}

}
