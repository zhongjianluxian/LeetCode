/*
 * Given a binary tree and a sum, 
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */
package LeetCode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        int remain = sum - root.val;
        if(root.left==null && root.right==null)
            if(0 == remain)
                return true;
            else
                return false;
        return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
