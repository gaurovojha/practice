package practice.core.java.usecases.blockingqueue;

public class PCTest {
	public static void main(String args[]){
		MyBlockingQueue queue = new MyBlockingQueue(2);
		Thread consumer = new Thread(new Consumer(queue));
		Thread producer = new Thread(new Producer(queue));
		
		consumer.start();
		producer.start();
	}
}
