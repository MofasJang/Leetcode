/*
 * @lc app=leetcode.cn id=309 lang=java
 * @lcpr version=21909
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1]-prices[1]);
        dp[1][1] = Math.max(dp[0][1], dp[0][0]+prices[1]);
        for(int i = 2; i < n; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-2][1]-prices[i]) ;
            dp[i][1] = Math.max(dp[i-1][1], prices[i]+dp[i-1][0]);
        }
        return dp[n-1][1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

