package practice.core.java.multithreading;

public class WaitAndNotifySumProblem {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable(){
			int sum = 0;
			public synchronized void run(){
				for(int i=0;i<1000000000;i++){
					sum += i;
				}
				System.out.println(sum);
				notify();
			}
		});
		t1.start();
		
		
		Thread t2 = new Thread();
		synchronized (t1) {
			try {
				System.out.println("T2 waiting for t1 to complete summing numbers");
				t1.wait();
				System.out.println("T2 is complete");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		synchronized (t1) {
			try {
				System.out.println("MAIN waiting for t1 to complete summing numbers");
				t1.wait();
				System.out.println("main is complete");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

