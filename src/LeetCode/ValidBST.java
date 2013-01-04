/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 */
package LeetCode;

public class ValidBST {
     
    public boolean isValidBSTHelper(TreeNode node, int min, int max)
    {   
        if(node == null)
            return true;
        if(node.val > min && node.val < max)
            return (isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right,node.val, max) );
        return false;
    }
    public boolean isValidBST(TreeNode root)
    {   return isValidBSTHelper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);}
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}


