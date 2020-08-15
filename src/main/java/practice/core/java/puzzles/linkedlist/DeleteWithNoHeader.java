package practice.core.java.puzzles.linkedlist;


/**
 * Delete a node from a single linkedlist whose HEAD node is not provided.
 */
public class DeleteWithNoHeader {

    public static void main(String[] args) {

        CustomLinkedList linkedList = new CustomLinkedList(10);
        linkedList.addNode(11);
        linkedList.printLinkedList();

    }
}
