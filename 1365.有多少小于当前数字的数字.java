/*
 * @lc app=leetcode.cn id=1365 lang=java
 * @lcpr version=21909
 *
 * [1365] 有多少小于当前数字的数字
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sum = new int[101];
        for(int i = 0; i < nums.length; i++){
            sum[nums[i]]++;
        }
        for(int i = 1; i < 101; i++){
            sum[i] += sum[i - 1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[i] = sum[nums[i] - 1];
            }
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,1,2,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,4,8]\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7]\n
// @lcpr case=end

 */

