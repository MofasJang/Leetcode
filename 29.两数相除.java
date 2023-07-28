/*
 * @lc app=leetcode.cn id=29 lang=java
 * @lcpr version=21910
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        int ans = 0;
        boolean fu = false;
        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0){
            fu = true;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        for (int j = 31; j >= 0; j--){
            int tmp = dividend >> j;
            if (tmp >= divisor){
                ans = ans | (1 << j);
                dividend -= (divisor << j);
            }
        }
        if(fu) {
            return -ans;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n3\n
// @lcpr case=end

// @lcpr case=start
// 7\n-3\n
// @lcpr case=end

 */

