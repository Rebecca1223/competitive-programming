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
    ArrayList<List<Integer>> ordered = new ArrayList<List<Integer>>();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = height(root);
        
        for (int i = 1; i <= level; i++) {
            //maker(root, i);
            temp.clear();
            ordered.add(new ArrayList<Integer>(maker(root, i)));
        }
        return ordered;
    }
    
    ArrayList maker(TreeNode root, int level) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        
        if (level == 1) {
            temp.add(root.val);
            System.out.println(temp.get(0));
        } else {
            maker(root.left, level - 1);
            maker(root.right, level - 1);
        }
        return temp;
    }
        
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }
}