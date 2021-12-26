package practice.core.leetcode.ll;

public class DetectCycle {

    public static void main(String[] args) {
        MyLinkedList myLinkedList =  new MyLinkedList();
//        myLinkedList.createLinkedListOfSize(4);
        ListNode node1 = new ListNode("node1");
        ListNode node2 = new ListNode("node2");
        ListNode node3 = new ListNode("node3");
        ListNode node4 = new ListNode("node4");
        node4.setNext(node2);
        myLinkedList.add(node1);
        myLinkedList.add(node2);
        myLinkedList.add(node3);
        myLinkedList.add(node4);
        System.out.println(detectCycle(myLinkedList.head));
    }

    private static boolean detectCycle(ListNode head){
        if(head == null) return false;
        ListNode slow;
        ListNode fast;
        slow = fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }


}
