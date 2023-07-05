import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=746 lang=java
 * @lcpr version=21909
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        for(int i = 2; i <= cost.length; i++){
            dp[i] = Math.min(dp[i-2]+cost[i-2], dp[i-1]+cost[i-1]) ;
        }
        return dp[cost.length];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,15,20]\n
// @lcpr case=end

// @lcpr case=start
// [1,100,1,1,1,100,1,1,100,1]\n
// @lcpr case=end

 */

