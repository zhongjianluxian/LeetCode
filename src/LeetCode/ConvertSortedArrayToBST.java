/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/*Definition for binary tree*/
  

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num == null || num.length == 0)
            return null;
        else return convert(num, 0, num.length-1);
        
    }
    
    private TreeNode convert(int[] num, int low, int high)
    {
        if(low > high)
            return null;
        int mid = low + (high - low)/2;
        int mid_val = num[mid];
        TreeNode node = new TreeNode(mid_val);
        node.left = convert(num, low, mid-1);
        node.right = convert(num, mid+1, high);
        
        return node;
    }
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
}