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
    int goodNodes(TreeNode* root) {
        if (!root) return 0;
        
        int result = 0;
        queue<pair<TreeNode*, int>> q;
        q.push({root, -10001});
        
        while(!q.empty()) {
            auto temp = q.front();
            int max = temp.second;
            
            if (temp.first->val >= max) {
                max = temp.first->val;
                cout << temp.first->val << " " << max << endl;
                result++;
            }
            q.pop();
            
            if (temp.first->left) q.push({temp.first->left, max});
            if (temp.first->right) q.push({temp.first->right, max});
        }
        
        return result;
    }
};