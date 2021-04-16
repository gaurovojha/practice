package practice.core.leetcode;

import java.util.List;
import java.util.stream.Stream;

public class AddTwoNumbersLL {

    public static void main(String[] args) {
//        System.out.println(18%10);
//        System.out.println(18/10);
        ListNode l1a = new ListNode(2);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);
        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = null;
        int num1 = getLLNumber(l1a);
        ListNode l2a = new ListNode(5);
        ListNode l2b = new ListNode(6);
        ListNode l2c = new ListNode(4);
        l2a.next = l2b;
        l2b.next = l2c;
        l2c.next = null;
//        int num2 = getLLNumber(l2a);
//        int newNum1 = reverseNumber(num1);
//        int newNum2 = reverseNumber(num2);
//        int res = reverseNumber(newNum1 + newNum2);
//        System.out.println(node.val);
//        ListNode node = createLL(String.valueOf(res));
        ListNode node = createNewLL(creatlinklist(new int[]{9,9,9,9,9,9,9}), creatlinklist(new int[]{9,9,9,9}));
//        creatlinklist(new int[]{1,2,3,4,5});
    }


    public static ListNode creatlinklist(int[] arr){
        ListNode head = new ListNode();
        ListNode curr = head;
        for(int i =0; i< arr.length; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head.next;
    }

    public static ListNode createNewLL(ListNode ll1, ListNode ll2){
        int carry = 0;
        ListNode head = new ListNode();
        ListNode curr  = head;
        while(ll1!=null || ll2!=null){
            int x = ll1 !=null ? ll1.val : 0;
            int y = ll2 !=null ? ll2.val : 0;
            int sum = x + y + carry;
            carry = sum/10 ;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(ll1 !=null) ll1 = ll1.next;
            if(ll2 !=null) ll2 = ll2.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    static ListNode createLL(String num){
        char[] arr = num.toCharArray();
        char c = num.toCharArray()[0];
        ListNode node = new ListNode(Character.getNumericValue(c));
        node.next = null;
        ListNode curr = node;
        for(int i=1; i< arr.length ; i++){
            ListNode newNode = new ListNode(Character.getNumericValue(arr[i]));
            newNode.next = null;
            curr.next = newNode;
            curr = curr.next;
        }
        return node;
    }

    static Integer getLLNumber(ListNode ll){
        String num = "";
        while (ll.next !=null){
            num += String.valueOf(ll.val);
            ll = ll.next;
        }
        num += String.valueOf(ll.val);
        return Integer.parseInt(num);
    }

    static Integer reverseNumber(Integer num){
        String newNum = "";
        while(num > 0){
            newNum += num % 10;
            num = num / 10;
        }
        return Integer.parseInt(newNum);
    }

}

/*
 *
 * Definition for singly-linked list.
 */

class ListNode {
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
