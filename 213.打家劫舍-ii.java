/*
 * @lc app=leetcode.cn id=213 lang=java
 * @lcpr version=21909
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2) return nums[0];
        int[] dp1 = new int[nums.length];
        dp1[0] = 0;
        dp1[1] = nums[0];
        for(int i = 2; i < nums.length; i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2]+nums[i-1]);
        }
        int[] dp2 = new int[nums.length];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2]+nums[i]);
        }
        return Math.max(dp1[nums.length-1], dp2[nums.length-1]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

 */

