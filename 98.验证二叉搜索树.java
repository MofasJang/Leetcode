import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=98 lang=java
 * @lcpr version=21909
 *
 * [98] 验证二叉搜索树
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
    ArrayList<Integer> list = new ArrayList<>(); 
    public boolean isValidBST(TreeNode root) {
        fun(root);
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1)) return false;
        }
        return true;
    }
    public void fun(TreeNode root){
        if(root == null) return;
        fun(root.left);
        list.add(root.val);
        fun(root.right);
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,4,null,null,3,6]\n
// @lcpr case=end

 */

