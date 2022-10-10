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
    int max = -1;
    int height = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, height);
        return sum;
    }

    public void dfs(TreeNode root, int height) {
        if (root == null) return;
        height++;
        dfs(root.left, height);
        if(root.left == null && root.right == null){
            if(max < height){
                max = height;
                sum = root.val;
            }
            else if(max == height){
                sum += root.val;
            }
        }
        dfs(root.right, height);
    }
}