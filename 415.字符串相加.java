/*
 * @lc app=leetcode.cn id=415 lang=java
 * @lcpr version=21910
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        char jin = '0';
        for(int i = 1; num1.length() >= i || num2.length() >= i; i++){
            char add = jin;
            if(num2.length() >= i){
                add += num2.charAt(num2.length()-i) - '0';
            }
            if(num1.length() >= i){
                add += num1.charAt(num1.length()-i) - '0';
            }
            jin = (char)((add - '0') / 10 + '0');
            res.append((char)((add - '0') % 10 + '0'));
        }
        if(jin != '0') {
            res.append(jin);
        }
        res.reverse();
        return res.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "11"\n"123"\n
// @lcpr case=end

// @lcpr case=start
// "456"\n"77"\n
// @lcpr case=end

// @lcpr case=start
// "0"\n"0"\n
// @lcpr case=end

 */

