package practice.core.leetcode.ll;

public class MyLinkedList {
    ListNode head = null;

    public void add(ListNode node){
        if(head == null){
            head = node;
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
    }

    @Override
    public String toString() {
        StringBuilder result =  new StringBuilder();
        ListNode curr = head;
        while(curr.next != null){
            result.append(curr.getData());
            curr = curr.next;
        }
        result.append(curr.getData());
        return result.toString();
    }

    public ListNode createLinkedListOfSize(int noOfNodes){
        for(int i=0 ;i< noOfNodes ;i++){
            ListNode newListNode = new ListNode(String.valueOf(i));
            System.out.println(String.format("adding node {%s}", i));
            add(newListNode);
        }
        return head;
    }
}
