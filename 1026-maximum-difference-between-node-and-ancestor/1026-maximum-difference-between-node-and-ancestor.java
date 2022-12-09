/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return difference(root, root.val, root.val);
    }
    
    int difference(TreeNode root, int small, int big) {
        if (root == null) return 0;
        if (root.val < small) small = root.val;
        if (root.val > big) big = root.val;
        
        return Math.max(difference(root.left, small, big), Math.max(difference(root.right, small, big), big - small));
    }
}