/*
 * @lc app=leetcode.cn id=45 lang=java
 * @lcpr version=21909
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int curCount = 0;
        int nextCount = 0;
        for(int i = 0; i < nums.length - 1; i++){
            nextCount = Math.max(nextCount, nums[i] + i);
            if(i == curCount){
                curCount = nextCount;
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,1,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,0,1,4]\n
// @lcpr case=end

 */

