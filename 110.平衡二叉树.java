/*
 * @lc app=leetcode.cn id=110 lang=java
 * @lcpr version=21908
 *
 * [110] 平衡二叉树
 */

// @lc code=start
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
    public boolean isBalanced(TreeNode root) {
        if(fun(root) == -1) return false;
        else return true;
    }
    public int fun(TreeNode node){
        if(node == null) return 0;

        int leftHeight = fun(node.left);
        if(leftHeight == -1) return -1;
        int rightHeight = fun(node.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(rightHeight-leftHeight) > 1) return -1;
        else return Math.max(leftHeight, rightHeight) + 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,3,3,null,null,4,4]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

