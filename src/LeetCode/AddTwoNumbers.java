/*
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 */
package LeetCode;

public class AddTwoNumbers {
   
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carrier = 0;
        int val = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
                val += l1.val;
            if(l2 != null)
                val += l2.val;
            cur.next = new ListNode( (val + carrier) % 10 );
            carrier = (val + carrier) / 10;
            cur = cur.next;
            l1 = l1==null?l1:l1.next;
            l2 = l2==null?l2:l2.next;
            val = 0;
        }
        if(carrier == 1)
            cur.next = new ListNode(1);
        return head.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
