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
    private boolean isMirrorTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left) && p.val == q.val;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirrorTree(root.left, root.right);
    }
}
