package practice.core.java.multithreading;

public class SimpleLock {

	private boolean  isLocked= false;
	
	/*
	 * Lock
	 */
	public synchronized void lock(){
		while(isLocked){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		isLocked = true;
	}

	/*
	 * Unlock
	 */
	public synchronized void unlock(){
		isLocked = false;
		notify();
	}
}
