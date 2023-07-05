import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1049 lang=java
 * @lcpr version=21909
 *
 * [1049] 最后一块石头的重量 II
 */

// @lc code=start
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i : stones) sum += i;
        int[] dp = new int[sum / 2 + 1];
        for(int i = 0; i < stones.length; i++){
            for(int j = sum/2; j >= stones[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[sum/2];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,7,4,1,8,1]\n
// @lcpr case=end

// @lcpr case=start
// [31,26,33,21,40]\n
// @lcpr case=end

 */

