package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock2 {

	private int i=0;
	private int j=0;
	
	// if we use synchronized keyword then in one class only one synchronized method can be accessible 
	// by thread.
	// so we can use lock to lock one particular code
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	 public void incrementI() {
		 lockForI.lock();
		i++;
		lockForI.unlock();
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}
	
	public int getJ() {
		return j;
	}
}
