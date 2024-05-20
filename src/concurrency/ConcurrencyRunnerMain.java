package concurrency;

public class ConcurrencyRunnerMain {

	public static void main(String[] args){
		//i++ is not Atomic
		//thread safety -> multiple threads runs at the same time safely.
		
		Counter1 counter = new Counter1();
		counter.increment();
		System.out.println(counter.getI());
	}
}
