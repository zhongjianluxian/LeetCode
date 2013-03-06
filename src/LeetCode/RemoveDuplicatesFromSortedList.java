/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
package LeetCode;

public class RemoveDuplicatesFromSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
      }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        int val = head.val;
        ListNode current = head;
        while(current.next!=null)
        {
            
            if(current.next.val == val)
                current.next = current.next.next;
            else
            { 
                current = current.next;
                val = current.val;
            }
        }
        return head;
    }
}
