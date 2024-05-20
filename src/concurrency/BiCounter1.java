package concurrency;

public class BiCounter1 {

	private int i=0;
	private int j=0;
	
	// if we use synchronized keyword then in one class only one synchronized method can be accessible 
	// by thread.
	// if we have different synchronized methods also only one thread at a time can 
	// access only one synchronized method
	// because of this perfomance will be impacted.
	synchronized public void incrementI() {
		i++;
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++;
	}
	
	public int getJ() {
		return j;
	}
}
