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
    boolean check = true;
    
    TreeNode prev = null;
    
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return check;
    }
    
    void inorder(TreeNode root){
        if(root == null) {
            return;
        }
        
        inorder(root.left);
        
        if(prev != null && root.val <= prev.val) {
            check = false;
            return;
        }
        prev = root;
        
        inorder(root.right);
    }
}