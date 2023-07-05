/*
 * @lc app=leetcode.cn id=377 lang=java
 * @lcpr version=21909
 *
 * [377] 组合总和 Ⅳ
 */

// @lc code=start
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int j = 1; j <= target; j++){
            for(int i = 0; i < nums.length; i++){
                if(j>=nums[i]) dp[j] += dp[j-nums[i]];
            }
        }

        return dp[target];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n4\n
// @lcpr case=end

// @lcpr case=start
// [9]\n3\n
// @lcpr case=end

 */

