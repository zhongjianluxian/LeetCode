/*
 * Populate each next pointer to point to its next right node. 
 * If there is no next right node, the next pointer should be set to NULL
 */
package LeetCode;

public class PopulatingNextRightPointersinEachNode {
    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        if(root.left==null && root.right==null)
            return;
        else
        {
            root.left.next = root.right;
            if(root.next != null)
                root.right.next = root.next.left;
            this.connect(root.left);
            this.connect(root.right);
        }   
    }
}
