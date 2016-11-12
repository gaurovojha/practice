package practice.core.java.multithreading;

public class DeadLockWithWaitAndNotify {

	public static void main(String[] args) throws InterruptedException {
		
		String resource1 = "resource1";
		String resource2 = "resource2";
		String resource3 = "resource3";

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource1) {
					synchronized (resource3) {
						try {
							resource3.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				synchronized (resource2) {
					
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource2) {
					synchronized (resource3) {
						try {
							resource3.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					synchronized (resource1) {
						
					}
				}
			}
		});

		t1.start();
		t2.start();
		
		Thread.sleep(2999);
		synchronized (resource3) {
			resource3.notifyAll();
		}
	}

}
