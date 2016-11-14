package practice.core.java.usecases.blockingqueue;

public class Producer implements Runnable{

private MyBlockingQueue queue;
	
	public Producer(MyBlockingQueue queue){
		this.queue = queue;
	}
	
	public void run() {
		//dequeue
		int count = 0;
		Integer item = new Integer(1);
		while(count<10){
			System.out.println("Enqueuing item"+ item);
			queue.enqueue(item);
			count++;
		}
	}
}
