/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
package LeetCode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        //Here we will create a new list of nodes and return,
        //instead of re-directing the pointers and do it in-place 
        ListNode head = null;
        ListNode cur = new ListNode(Integer.MIN_VALUE);
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else
            {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(head == null)
                head = cur.next;
           cur = cur.next;   
        }
        if(l1==null)
            this.copyList(cur, l2);
        else
            this.copyList(cur,l1);
        return head;
    }
    private void copyList(ListNode cur, ListNode l)
    {
        while(l!=null)
        {
            cur.next = new ListNode(l.val);
            l = l.next;
            cur = cur.next;
        }
    }
    public class ListNode 
    {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}