import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=501 lang=java
 * @lcpr version=21909
 *
 * [501] 二叉搜索树中的众数
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
    List<Integer> res = new ArrayList<>();
    int maxcount = 1;
    int count = 0;
    TreeNode pre = null;
    public int[] findMode(TreeNode root) {
        fun(root);
        return res.stream().mapToInt(i->i).toArray();
    }
    public void fun(TreeNode node){
        if(node == null) return;
        if(node.left != null) fun(node.left);

        if(pre == null) count = 1;
        else if(pre.val == node.val) count++;
        else count = 1;
        
        if(count > maxcount) {
            maxcount = count;
            res.clear();
        }
        
        if(count == maxcount){
            res.add(node.val);
        }

        pre = node;
        if(node.right != null) fun(node.right);
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

