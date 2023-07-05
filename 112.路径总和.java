import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=112 lang=java
 * @lcpr version=21909
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return CalcPath(root, targetSum - root.val); 
    }   
    public boolean CalcPath(TreeNode node, int targetSum){
        if(node.left == null && node.right == null){
            if(targetSum == 0) return true;
            else return false;
        }
        if(node.left != null){
            if(CalcPath(node.left, targetSum - node.left.val)) return true;
        }
        if(node.right != null){
            if(CalcPath(node.right, targetSum - node.right.val)) return true;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,null,1]\n22\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// []\n0\n
// @lcpr case=end

 */

