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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean isReverse = false;
        while (!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            List<Integer> l = new ArrayList<>();
            while (!queue.isEmpty()) {
                list.add(queue.peek());
                l.add(queue.poll().val);
            }
            for (TreeNode node : list) {
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (isReverse) Collections.reverse(l);
            isReverse = !isReverse;
            ans.add(l);
        }
        return ans;
    }
}
