/*
 * @lc app=leetcode.cn id=376 lang=java
 * @lcpr version=21909
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int res = nums.length;
        int pre = 0, mid = 1;
        for(int i = 2; i <= nums.length - 1; i++){
            if((nums[mid] - nums[pre]) * (nums[i] - nums[mid]) < 0){
                pre = mid;
                mid = i;
            }
            else{
                mid++;
                res--;
            }
        }
        if(res == 2 && nums[0] == nums[1]) res=1;
        return res;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,7,4,9,2,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,17,5,10,13,15,10,5,16,8]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7,8,9]\n
// @lcpr case=end

 */

