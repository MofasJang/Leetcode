/*
 * @lc app=leetcode.cn id=188 lang=java
 * @lcpr version=21909
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2 * k + 1];
        for(int j = 0; j < k; j++){
            dp[0][2 * j + 1] = -prices[0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < k; j++){
                dp[i][2 * j + 1] = Math.max(dp[i - 1][2 * j + 1], dp[i - 1][2 * j] - prices[i]);
                dp[i][2 * j + 2] = Math.max(dp[i - 1][2 * j + 2], dp[i - 1][2 * j + 1] + prices[i]);
            }
        }
        return dp[n - 1][2 * k];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n[2,4,1]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[3,2,6,5,0,3]\n
// @lcpr case=end

 */

