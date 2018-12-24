/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Given a binary tree, return the inorder traversal of its nodes' values.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList();
        if (root == null)
            return l;
        inorderTraversal(root, l);
        
        return l;
    }
    
    private void inorderTraversal(TreeNode root, List l){
        if (root == null)
            return;
        inorderTraversal(root.left, l);
        l.add(root.val);
        inorderTraversal(root.right, l);
    }
}
