/*
 * @lc app=leetcode.cn id=134 lang=java
 * @lcpr version=21909
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int start = 0;
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            curSum += gas[i] - cost[i];           
            total += gas[i] - cost[i];           
            if(curSum < 0){
                start = i + 1;
                curSum = 0;
            }
        }
        if(total < 0) return -1;
        return start;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n[3,4,5,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4]\n[3,4,3]\n
// @lcpr case=end

 */

