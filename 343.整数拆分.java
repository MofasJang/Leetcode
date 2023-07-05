import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=343 lang=java
 * @lcpr version=21909
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for(int i = 3; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++){
                max = Math.max(max, dp[j]*(i-j));
            }
            dp[i] = max;
        }
        return dp[n-1];
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

