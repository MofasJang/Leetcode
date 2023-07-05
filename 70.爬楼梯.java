/*
 * @lc app=leetcode.cn id=70 lang=java
 * @lcpr version=21909
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int[] steps = new int[]{1,2};
        dp[0] = 1;
        for(int j = 1; j <= n; j++){
            for(int i = 0; i < 2; i++){
                if(j >= steps[i]) dp[j] += dp[j-steps[i]];
            }
        }
        return dp[n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */

