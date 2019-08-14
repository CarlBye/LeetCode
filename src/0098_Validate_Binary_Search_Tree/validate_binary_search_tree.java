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
    public boolean isValidBST(TreeNode root) {
        return func(root, -1, -1);
    }
    
    private boolean func(TreeNode node, int lower, int upper) {
        if (node == null) return true;
        
        int val = node.val;
        if (lower != -1 && val <= lower) return false;
        if (upper != -1 && val >= upper) return false;
        
        return func(node.left, lower, val) && func(node.right, val, upper);        
    }
}
