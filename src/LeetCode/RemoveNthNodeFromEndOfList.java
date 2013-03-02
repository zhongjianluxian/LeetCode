/*
 * Given a linked list, remove the nth node from the end of list and return its head.
 */
package LeetCode;

public class RemoveNthNodeFromEndOfList {
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode tail = head;
        for(int i=0;i<n;i++)
            tail = tail.next;
        if(tail == null)
            return head.next;
        while(tail.next!=null)
        {
            current = current.next;
            tail = tail.next;
        }
        current.next = current.next.next;
        return head;
    }
}
