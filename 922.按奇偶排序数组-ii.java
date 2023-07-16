import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=922 lang=java
 * @lcpr version=21909
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ou = 0;
        int ji = 1;
        while(ou < nums.length - 1 && ji < nums.length){
            if(nums[ou] % 2 == 1 && nums[ji] % 2 == 0){
                int temp = nums[ou];
                nums[ou] = nums[ji];
                nums[ji] = temp;
            }
            if(nums[ou] % 2 == 0) {
                ou += 2;
            }
            if(nums[ji] % 2 == 1) {
                ji += 2;
            }
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [2,3]\n
// @lcpr case=end

 */

