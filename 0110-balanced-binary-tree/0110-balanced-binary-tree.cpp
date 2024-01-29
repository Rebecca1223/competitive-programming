/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int traverse(TreeNode* root) {
        if (!root) return 0;
        
        int left = traverse(root->left);
        int right = traverse(root->right);
        
        if (abs(left-right) > 1) {
            return 6000;
        } else {
            return 1 + max(left, right);
        }
    }
    
    bool isBalanced(TreeNode* root) {
        if (traverse(root) >= 6000) return false;
        return true;
    }
};