package practice.core.java.usecases.blockingqueue;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue {

	private List<Integer> queue ;
	private int limit ; 
	
	public MyBlockingQueue(int limit){
		this.limit = limit ;
		queue = new LinkedList<Integer>();
	}
	
	public synchronized void enqueue(Integer item){
		while(queue.size()==limit){
			try {
				System.out.println("producer is waiting when queue size is " + queue.size());
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		queue.add(item);
		System.out.println("Notifying consumer when queue size is " + queue.size());
		this.notify();
	}
	
	public synchronized Integer dequeue(){
		Integer item;
		while(queue.size()==0){
			try {
				System.out.println("consumer is waiting when the queue size is "+ queue.size());
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		item =  queue.get(0);
		queue.remove(0);
		System.out.println("Notifying producer when queue size is " + queue.size());
		this.notify();
		return item;
	}
}
