/*
 * @lc app=leetcode.cn id=279 lang=java
 * @lcpr version=21909
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int j = 1; j <= n; j++) dp[j] = Integer.MAX_VALUE;
        dp[0] = 0;
        for(int j = 1; j <= n; j++){
            for (int i = 1; i * i <= j; i++) {
                dp[j] = Math.min(dp[j], dp[j-i*i]+1);
            }
        }
        return dp[n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n
// @lcpr case=end

// @lcpr case=start
// 13\n
// @lcpr case=end

 */

