/*
 * @lc app=leetcode.cn id=53 lang=java
 * @lcpr version=21909
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        // 贪
        // int res = Integer.MIN_VALUE;
        // int count = 0;
        // for(int i : nums){
        //     count += i;
        //     res=Math.max(count,res);
        //     if(count < 0) count = 0;
        // }
        // return res;

        //DP
        int[] dp = new int[nums.length + 1];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i <= nums.length; i++){
            dp[i] = Math.max(dp[i - 1] + nums[i - 1], nums[i - 1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-2,1,-3,4,-1,2,1,-5,4]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,-1,7,8]\n
// @lcpr case=end

 */

