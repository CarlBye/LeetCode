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
    int preIndex = 0;
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> map;
    
    private TreeNode func(int inStart, int inEnd) {
        if (inStart > inEnd) return null; 
        int inIndex = map.get(preorder[preIndex]);
        TreeNode root = new TreeNode(preorder[preIndex++]);
        
        
        root.left = func(inStart, inIndex - 1);
        root.right  = func(inIndex + 1, inEnd);
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        
        this.map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return func(0, inorder.length - 1);
    }
}
