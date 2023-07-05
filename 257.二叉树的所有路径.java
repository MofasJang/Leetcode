import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
 * @lc app=leetcode.cn id=257 lang=java
 * @lcpr version=21908
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Object> stack = new Stack<>();
        stack.push(root);
        stack.push(root.val + "");
        while(!stack.isEmpty()){
            String path = (String)stack.pop();
            TreeNode node = (TreeNode)stack.pop();
            if(node.left == null && node.right == null){
                result.add(path);
            }
            if(node.left != null){
                stack.push(node.left);
                stack.push(path + "->" + node.left.val);
            }
            if(node.right != null){
                stack.push(node.right);
                stack.push(path + "->" + node.right.val);
            }
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,5]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

