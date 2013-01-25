/*
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
package LeetCode;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList();
        this.inorderTraversal(root, result);
        return result;
    }
    private void inorderTraversal(TreeNode node, ArrayList<Integer> result)
    {
        if(node == null)
            return;
        if(node.left != null)
            inorderTraversal(node.left, result);
        result.add(node.val);
        if(node.right != null)
            inorderTraversal(node.right, result);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
