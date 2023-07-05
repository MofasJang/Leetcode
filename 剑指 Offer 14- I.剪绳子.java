import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=剑指 Offer 14- I lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 14- I] 剪绳子
 */

// @lc code=start
class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        for(int i = 2; i <= n; i++){
            int maximun = 0;
            for(int j = 1; j < i; j++)
                maximun = Math.max(maximun, Math.max(j * (i - j), j * dp[i - j]));
            dp[i] = maximun;
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
// 10\n
// @lcpr case=end

 */

