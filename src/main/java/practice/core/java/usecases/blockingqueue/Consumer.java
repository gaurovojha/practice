package practice.core.java.usecases.blockingqueue;

public class Consumer implements Runnable{

	private MyBlockingQueue queue;
	
	public Consumer(MyBlockingQueue queue){
		this.queue = queue;
	}
	
	public void run() {
		//dequeue
		while(true){
			System.out.println("Dequing item" + queue.dequeue());
		}
	}
}
