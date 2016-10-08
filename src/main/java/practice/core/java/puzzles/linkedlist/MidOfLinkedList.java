package practice.core.java.puzzles.linkedlist;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Node{

	String data;
	Node next;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

public class MidOfLinkedList {
	

	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setData("Node1");
		Node head = n1;
		Node n2 = new Node();
		n2.setData("Node2");
		n1.setNext(n2);
		Node n3 = new Node();
		n3.setData("Node3");
		n2.setNext(n3);
		Node n4 = new Node();
		n4.setData("Node4");
		n3.setNext(n4);
		Node n5 = new Node();
		n5.setData("Node5");
		n4.setNext(n5);
		//Node n6 = new Node();
		//n6.setData("Node6");
		n5.setNext(null);
		//n6.setNext(null);
		
		System.out.println("************************" +findMidOfLinkedList(head).getData());
		

	}
	
	public static Node findMidOfLinkedList(Node head){
		Node output = head;
		Node temp =  head;
		while(temp.getNext().getNext()!=null){
			System.out.println("temp" +temp.getData());
			System.out.println("output" +output.getData());
			temp = temp.getNext().getNext();
			output = output.getNext();
		}
		return output;
	}

}
