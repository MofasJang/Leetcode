/*
 * @lc app=leetcode.cn id=925 lang=java
 * @lcpr version=21910
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while(i < name.length() && j < typed.length()) {
            int sum1 = 0;
            char c1 = name.charAt(i);
            int sum2 = 0;
            char c2 = typed.charAt(j);
            while(i < name.length() && name.charAt(i) == c1) {
                i++;
                sum1++;
            }
            
            while(j < typed.length() && typed.charAt(j) == c2) {
                j++;
                sum2++;
            }
            if(sum1 > sum2 || c1 != c2) {
                return false;
            }
        }
        if(j < typed.length() || i < name.length()) {
            return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "alex"\n"aaleex"\n
// @lcpr case=end

// @lcpr case=start
// "saeed"\n"ssaaedd"\n
// @lcpr case=end

 */

