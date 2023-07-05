/*
 * @lc app=leetcode.cn id=337 lang=java
 * @lcpr version=21909
 *
 * [337] 打家劫舍 III
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
    public int rob(TreeNode root) {
        int[] dp = robTree(root);
        return Math.max(dp[0], dp[1]);
    }
    public int[] robTree(TreeNode root){
        int[] dp = new int[]{0,0};
        if(root == null) return dp;
        int[] dp1 = robTree(root.left);
        int[] dp2 = robTree(root.right);
        dp[0] = Math.max(dp1[0], dp1[1])+Math.max(dp2[0], dp2[1]);
        dp[1] = dp1[0] + dp2[0] + root.val;
        return dp;
    }
} 
// @lc code=end



/*
// @lcpr case=start
// [3,2,3,null,3,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,1,3,null,1]\n
// @lcpr case=end

 */

