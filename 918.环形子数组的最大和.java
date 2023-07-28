import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=918 lang=java
 * @lcpr version=21910
 *
 * [918] 环形子数组的最大和
 */

// @lc code=start
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int preMax = nums[0], max = nums[0];
        int preMin = nums[0], min = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            preMax = Math.max(preMax + nums[i], nums[i]);
            max = Math.max(max, preMax);
            preMin = Math.min(preMin + nums[i], nums[i]);
            min = Math.min(min, preMin);
            sum += nums[i];
        }
        if(preMax < 0) {
            return max;
        }
        return Math.max(max, sum - min);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,-2,3,-2]\n
// @lcpr case=end

// @lcpr case=start
// [5,-3,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,-2,2,-3]\n
// @lcpr case=end

 */

