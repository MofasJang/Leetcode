import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=530 lang=java
 * @lcpr version=21909
 *
 * [530] 二叉搜索树的最小绝对差
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
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        TreeNode pre = null;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur = st.peek();
            if(cur != null){
                st.pop();
                if(cur.right != null) st.push(cur.right);
                st.push(cur);
                st.push(null);
                if(cur.left != null) st.push(cur.left);
            }
            else{
                st.pop();
                cur = st.pop();
                if(pre != null) res = Math.min(res, Math.abs(cur.val-pre.val));
                pre = cur;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,6,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,48,null,null,12,49]\n
// @lcpr case=end

 */

