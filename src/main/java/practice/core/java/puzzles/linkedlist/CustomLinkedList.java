package practice.core.java.puzzles.linkedlist;

public class CustomLinkedList {

    public CustomLinkedList(int data) {
        this.head = new Node(data);
        this.head.next=null;
    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public void addNode(int data){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node = new Node(data);
        temp.next = node;
        temp.next.setNext(null);
    }


    public void printLinkedList(){
        Node temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteNode(Node node){

    }

    public Node createNode(int data){
        return new Node(data);
    }

    class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

}

