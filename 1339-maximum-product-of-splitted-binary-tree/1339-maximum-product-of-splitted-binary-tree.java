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
    public int maxProduct(TreeNode root) {
        long max = 0;
        List<Integer> sum = new ArrayList<Integer>();
        long total = treesum(root, sum);
        
        for(long i : sum) {
            max = Math.max(max, i * (total - i));
        }
        
        return (int) (max % (1e9+7));
    }
    
    public int treesum(TreeNode root, List<Integer> sum){
        if(root == null) return 0;
        
        int left = treesum(root.left, sum);
        int right = treesum(root.right, sum);
        int combined = root.val + left + right;
        
        sum.add(combined);
        
        return combined;
    }
}