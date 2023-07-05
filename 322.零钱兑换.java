import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=322 lang=java
 * @lcpr version=21909
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int j = 1; j <= amount; j++) dp[j] = Integer.MAX_VALUE;
        for(int j = 1; j <= amount; j++){
            for (int c : coins) {
                if(j >= c && dp[j-c] != Integer.MAX_VALUE) dp[j] = Math.min(dp[j], dp[j-c]+1);
            }
        }
        if(dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 2, 5]\n11\n
// @lcpr case=end

// @lcpr case=start
// [2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n0\n
// @lcpr case=end

 */

