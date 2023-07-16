/*
 * @lc app=leetcode.cn id=35 lang=java
 * @lcpr version=21910
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        // 暴力
        // int res = 0;
        // while(res < nums.length && nums[res] < target){
        //     res++;
        // }
        // return res;

        // 二分
        int left = 0;
        int right = nums.length - 1;
        int mid; 
        while(left <= right) {
            mid = (left + right) / 2;
            if(nums[mid] > target){
                right = mid - 1; 
            }
            else if(nums[mid] < target){
                left = mid + 1; 
            }
            else{
                return mid;
            }
        }
        return right + 1;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,6]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n7\n
// @lcpr case=end

 */

