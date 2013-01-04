/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 */
package LeetCode;

public class ValidBST {
     
    int temp = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root)
    {   
        if(root == null)
            return true;
        if( isValidBST(root.left) )
        {
            if(root.val > temp)
            {
                temp = root.val;
                return  isValidBST(root.right);
            }
        }
        return false;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}


