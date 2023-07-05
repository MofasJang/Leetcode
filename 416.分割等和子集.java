import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=416 lang=java
 * @lcpr version=21909
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if(sum % 2 == 1) return false;
        int[] dp = new int[sum / 2 + 1];
        for(int i = 0; i < nums.length; i++){
            for(int j = sum/2; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-nums[i]] + nums[i]);
            }
            if(dp[sum/2] == sum/2) return true;
        }
        return false;
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,5,11,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,5]\n
// @lcpr case=end

 */

