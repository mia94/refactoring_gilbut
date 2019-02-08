package refactoring_gilbut.chap13.after;

import java.util.Random;

public class Dice{
	
	private final Random random;
	
	public Dice() {
		/*super(314159L);
		random = this;*/
		random = new Random(314159L);
	}
	public Dice(long seed) {
		/*super(seed);
		random=this;*/
		random = new Random(seed);
	}
	
	
	public int nextInt() {
		return random.nextInt(6)+1;
	}
	
	public void setSeed(long seed) {
		random.setSeed(seed);
	}
	
	
}
