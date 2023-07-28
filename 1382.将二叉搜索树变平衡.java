import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1382 lang=java
 * @lcpr version=21910
 *
 * [1382] 将二叉搜索树变平衡
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
    ArrayList<Integer> sort = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        addList(root);
        return createTree(sort.stream().mapToInt(i->i).toArray());
    }
    public void addList(TreeNode root) {
        if(root == null) {
            return;
        }
        addList(root.left);
        sort.add(root.val);
        addList(root.right);
        return;
    }
    public TreeNode createTree(int[] list) {
        if(list.length == 0) {
            return null;
        }
        int mid = list.length / 2;
        TreeNode root = new TreeNode(list[mid]);
        root.left = createTree(Arrays.copyOfRange(list, 0, mid));
        root.right = createTree(Arrays.copyOfRange(list, mid + 1, list.length));
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,2,null,3,null,4,null,null]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

 */

