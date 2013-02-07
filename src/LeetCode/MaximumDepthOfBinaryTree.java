/*
 * Given a binary tree, find its maximum depth. The maximum depth is the number 
 * of nodes along the longest path from the root node down to the farthest leaf node.
 */
package LeetCode;

public class MaximumDepthOfBinaryTree {
     public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
    }
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
}
