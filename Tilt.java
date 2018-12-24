
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int tilt = 0;                           // can't use as a function argument as it will set                                              back to 0 on every stack call as it is postOrder
    public int findTilt(TreeNode root) {
        tiltFinder(root);
        return tilt;
    }
    public int tiltFinder(TreeNode root) {// Should be post order as we are going to                                                        the bottom and adding up the tilt
        if(root==null )
            return 0;
        int left=tiltFinder(root.left);
        int right=tiltFinder(root.right);
        tilt+=Math.abs(left-right);
        return left + right + root.val;    // returns whole sum of the subtree           
    }
}
