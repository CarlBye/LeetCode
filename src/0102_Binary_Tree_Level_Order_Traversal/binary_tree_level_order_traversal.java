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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        dq.addLast(root);
        while (!dq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int cnt = dq.size();
            while (cnt > 0) {
                TreeNode cur = dq.removeFirst();
                list.add(cur.val);
                if (cur.left != null) {
                    dq.addLast(cur.left);
                }
                if (cur.right != null) {
                    dq.addLast(cur.right);
                }
                cnt--;
            }
            ans.add(list);
        }
        return ans;
    }
}
