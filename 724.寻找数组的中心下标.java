import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=724 lang=java
 * @lcpr version=21909
 *
 * [724] 寻找数组的中心下标
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int[] nums_reverse = Arrays.copyOf(nums, nums.length);
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            nums_reverse[i] += nums_reverse[i + 1];
        }
        int res = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums_reverse[i]){
                res = i;
                break;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 7, 3, 6, 5, 6]\n
// @lcpr case=end

// @lcpr case=start
// [1, 2, 3]\n
// @lcpr case=end

// @lcpr case=start
// [2, 1, -1]\n
// @lcpr case=end

 */

