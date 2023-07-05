/*
 * @lc app=leetcode.cn id=55 lang=java
 * @lcpr version=21909
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int count = 0;
        if(nums.length == 1) return true;
        for(int i = 0; i <= count; i++){
            count = Math.max(count, i + nums[i]);
            if(count >= nums.length - 1) return true;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,1,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1,0,4]\n
// @lcpr case=end

 */

