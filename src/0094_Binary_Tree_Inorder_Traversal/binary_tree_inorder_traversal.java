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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        func(list, root);
        return list;
    }
    
    private void func(List<Integer> list, TreeNode node) {
        if (node == null) return;
        func(list, node.left);
        list.add(node.val);
        func(list, node.right);
        return;
    }
}
