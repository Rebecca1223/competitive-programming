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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1 = new ArrayList<Integer>();
        ArrayList<Integer> tree2 = new ArrayList<Integer>();
        
        add(root1, tree1);
        add(root2, tree2);
        
        if (tree1.size() != tree2.size()) return false;
        
        for (int i = 0; i < tree1.size(); i++) {
            if (tree1.get(i) != tree2.get(i)) return false;
        }
        return true;
    }
    
    void add(TreeNode tree, ArrayList list) {
        if (tree != null) {
            if (tree.left == null && tree.right == null) {
                list.add(tree.val);
            }
            add(tree.left, list);
            add(tree.right, list);
        } 
    }
}