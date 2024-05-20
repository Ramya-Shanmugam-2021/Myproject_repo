package concurrency;

public class Counter1 {

	private int i=0;
	
	public void increment() {
		i++; // it is not thread safe because there is a chance that an update 
		//might be lost when multiple threads working.
		// ex : thread1 getting i=15 and increments as 16 , if again another thread
		// comes it will take i value as 15 not incremented value , so it is missing update.
		// and we are calling it as not thread safe.
		
		// i++  => it has 3 operations such as
		//get i
		//increment i
		//set i
	}
	
	public int getI() {
		return i;
	}
}
