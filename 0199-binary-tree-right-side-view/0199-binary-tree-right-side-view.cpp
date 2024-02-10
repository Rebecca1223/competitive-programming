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
    vector<int> rightSideView(TreeNode* root) {
        vector<int> output;
        if (!root) return output;
 
        vector<TreeNode*> cur = {root};

        while (!cur.empty()) {
            vector<TreeNode*> next;
            for (auto node : cur) {
                if (node->left) next.push_back(node->left);
                if (node->right) next.push_back(node->right);
            }
            
            output.push_back(cur.back()->val);
            cur = next;
        }
        
        return output;
    }
};