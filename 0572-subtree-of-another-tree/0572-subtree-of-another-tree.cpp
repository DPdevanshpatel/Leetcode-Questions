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

    bool isidentical(TreeNode* root, TreeNode* root2)
    {
        if(root==NULL || root2==NULL) return root==root2;

        bool lefttree = isidentical(root->left,root2->left);
        bool righttree = isidentical(root->right,root2->right);

        return lefttree && righttree && root->val==root2->val;
    }

    bool isSubtree(TreeNode* root, TreeNode* subroot) {
        if(root==NULL || subroot==NULL) return root==subroot;

        if(root->val==subroot->val && isidentical(root,subroot)) return true;

        return isSubtree(root->left,subroot) || isSubtree(root->right,subroot);
    }
};