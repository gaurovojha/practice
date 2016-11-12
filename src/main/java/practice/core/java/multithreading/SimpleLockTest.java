package practice.core.java.multithreading;

public class SimpleLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				counter.counter();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				counter.counter();

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				counter.counter();

			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
}

class Counter {
	private SimpleLock simpleLock = new SimpleLock();
	private int count = 0;

	public void counter() {

		simpleLock.lock();

		count = count + 1;
		System.out.println(count);
		
		simpleLock.unlock();
		
	}
}
