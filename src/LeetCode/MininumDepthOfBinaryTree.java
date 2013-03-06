/*
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
package LeetCode;

public class MininumDepthOfBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right== null)
            return 1;
        if(root.left == null && root.right != null)
            return 1 + minDepth(root.right);
        if(root.left != null && root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        
    }
}
