package practice.core.leetcode.amazon;

import org.junit.Test;

/*
        You are given the heads of two sorted linked lists list1 and list2.
        Merge the two lists in a one sorted list.
        The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.
        Example 1:
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:
        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]*/
public class MergeSortedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
              ListNode head = null;
            if(list1.val==list2.val){
                head = list1;
            }else if(list1.val<list2.val){
                head = list1;
            }else{
                head = list2;
            }
            ListNode curr = head;
              while(list1!=null && list2!=null){
                  if(list1.val==list2.val) {
                      list1 = list1.next;
                      curr.next = list2;
                      list2 = list2.next;
                      curr = curr.next;
                  }else if(list1.val<list2.val){
                      list2 = list2.next;
                      curr.next = list1;
                      list1 = list1.next;
                      curr = curr.next;
                      curr.next = list2;
                      curr = curr.next;
                  }else{
                      list1 = list1.next;
                      curr.next = list2;
                      list2 = list2.next;
                      curr = curr.next;
                      curr.next = list1;
                      curr = curr.next;
                  }
              }
           return head;

    }




    @Test
    public void test(){
        ListNode l1 = new ListNode();
        l1.val = 1;
        ListNode l2 = new ListNode();
        l2.val = 2;
        l1.next = l2;
        ListNode l3 = new ListNode();
        l3.val = 4;
        l2.next = l3;
        l3.next = null;
        ListNode a1 = new ListNode();
        a1.val = 1;
        ListNode a2 = new ListNode();
        a2.val = 3;
        a1.next = a1;
        ListNode a3 = new ListNode();
        a3.val = 4;
        a2.next = a3;
        a3.next = null;
        mergeTwoLists(l1,a1);

    }
}
