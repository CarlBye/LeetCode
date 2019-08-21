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
    public void flatten(TreeNode root) {
        func(root);
    }
    
    private TreeNode func(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;
        
        TreeNode l = func(root.left);
        root.left = null;
        if (l != null) {
            TreeNode lTail = l;
            while (lTail.right != null) {
                lTail = lTail.right;
            }
            lTail.right = func(root.right);
            root.right = l;
        } else {
            root.right = func(root.right);
        }
        return root;
    } 
}
