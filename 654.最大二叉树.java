import java.util.Arrays;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=654 lang=java
 * @lcpr version=21909
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        
        int max = -1;
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(nums[index]);
        
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, nums.length));
        return node;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,1,6,0,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1]\n
// @lcpr case=end

 */

