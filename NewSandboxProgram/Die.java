
public class Die {
	private int numDots;
	
	public void roll() {
		numDots = (int)(1 + Math.random()* 6);
	}
	
	public int getNumDots() {
		return numDots;
	}
}