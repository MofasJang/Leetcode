import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=509 lang=java
 * @lcpr version=21909
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {        
        if(n<2) return n;
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int temp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return dp[1];
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

// @lcpr case=start
// 4\n
// @lcpr case=end

 */

