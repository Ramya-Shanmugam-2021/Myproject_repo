package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger3 {

	private AtomicInteger i= new AtomicInteger();
	private AtomicInteger j= new AtomicInteger();
	
	// if we use synchronized keyword then in one class only one synchronized method can be accessible 
	// by thread.
	// so we can use lock to lock one particular code
	// AtomicInteger is thread safe compared locks
	
	 public void incrementI() {
		 
		i.incrementAndGet(); // this method will be automatically atomic operation
		//it means it will provide thread safety and will increment also
	}
	
	public int getI() {
		return i.get();
	}
	
	
	synchronized public void incrementJ() {
		j.incrementAndGet();
	}
	
	public int getJ() {
		return j.get();
	}
}
