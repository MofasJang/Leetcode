/*
 * @lc app=leetcode.cn id=129 lang=java
 * @lcpr version=21910
 *
 * [129] 求根节点到叶节点数字之和
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
    int res = 0;
    public int sumNumbers(TreeNode root) {
        fun(root, 0);
        return res;
    }
    public void fun(TreeNode root, int father) {
        if(root.left == null && root.right == null) {
            res += 10 * father + root.val;
            return;
        }
        if(root.left != null) fun(root.left, (10 * father) + root.val);
        if(root.right != null) fun(root.right, (10 * father) + root.val);
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,0,5,1]\n
// @lcpr case=end

 */

