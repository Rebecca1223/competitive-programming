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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        TreeNode build = new TreeNode(max);
        if (maxIndex != 0) {
            build.left = construct(nums, 0, maxIndex-1);
        }
        if (maxIndex != nums.length-1) {
            build.right = construct(nums, maxIndex+1, nums.length-1);
        }
        
        return build;
    }
    
    TreeNode construct(int[] nums, int start, int end) {
        int max = nums[start];
        int maxIndex = start;
        for (int i = start; i < end+1; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        TreeNode temp = new TreeNode(max);
        if (maxIndex != start) {
            temp.left = construct(nums, start, maxIndex-1);
        }
        if (maxIndex != end) {
            temp.right = construct(nums, maxIndex+1, end);
        }
        
        return temp;
    }
}