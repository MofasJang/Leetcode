/*
 * @lc app=leetcode.cn id=2460 lang=java
 * @lcpr version=21908
 *
 * [2460] 对数组执行操作
 */

// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]!=0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }
            else j++;
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

 */

