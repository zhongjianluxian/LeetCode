/*
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which 
 * the depth of the two subtrees of every node never differ by more than 1.
 */
package LeetCode;

public class BalancedBinaryTree 
{
    public boolean isBalanced(TreeNode root) {
        if(root == null) 
            return true;
        if(Math.abs(this.height(root.left) - this.height(root.right))<=1) 
            return isBalanced(root.left) && isBalanced(root.right);    
        return false;
    }
    public int height(TreeNode node){
        if(node ==null) 
            return 0;
        return 1+Math.max(this.height(node.left), this.height(node.right));
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
