/*
 * @lc app=leetcode.cn id=9 lang=java
 * @lcpr version=21910
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // 判断数字是否为回文数
        if (x < 0) {
            return false;
        }
        int y = x;
        int z = 0;
        while (y != 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }
        return z == x;
    }
    
}
// @lc code=end



/*
// @lcpr case=start
// 121\n
// @lcpr case=end

// @lcpr case=start
// -121\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

