import java.lang.annotation.Target;

/*
 * @lc app=leetcode.cn id=494 lang=java
 * @lcpr version=21909
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i : nums) sum += i;
        if((target+sum)%2 == 1 || Math.abs(target) > sum) return 0;
        sum = (sum+target) / 2;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = sum; j >= nums[i]; j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[sum];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1,1,1]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

 */

