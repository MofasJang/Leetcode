import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=283 lang=java
 * @lcpr version=21909
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            if(nums[j] != 0) {
                nums[i++] = nums[j++];
            }
            else {
                j++;
            }
        }
        while(i < nums.length){
            nums[i++] = 0;
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,0,3,12]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

