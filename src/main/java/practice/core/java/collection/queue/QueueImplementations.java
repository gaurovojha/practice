package practice.core.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementations {

	public static void main(String[] args){
		Queue linkedListImpl = new LinkedList();
		
		linkedListImpl.add("Gaurov");
		linkedListImpl.add("Himanshu");
		linkedListImpl.add("Raatanpal");
		linkedListImpl.add("neha");
		linkedListImpl.add("Vishesh");
		
		System.out.println(linkedListImpl.peek());
		System.out.println(linkedListImpl.poll());
		System.out.println(linkedListImpl.peek());
	}
}

