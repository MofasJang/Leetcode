/*
 * @lc app=leetcode.cn id=34 lang=java
 * @lcpr version=21909
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[]{-1,-1};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(pos[0] == -1) {
                    pos[0] = i;
                }
                pos[1] = i;
            }
        }
        return pos;
    } 
}
// @lc code=end



/*
// @lcpr case=start
// [5,7,7,8,8,10]\n8\n
// @lcpr case=end

// @lcpr case=start
// [5,7,7,8,8,10]\n6\n
// @lcpr case=end

// @lcpr case=start
// []\n0\n
// @lcpr case=end

 */

