/*
 * @lc app=leetcode.cn id=738 lang=java
 * @lcpr version=21909
 *
 * [738] 单调递增的数字
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int n) {
        StringBuilder num = new StringBuilder(String.valueOf(n));
        int flag = num.length();
        for(int i = num.length()-1; i > 0; i--){
            if(num.charAt(i-1) > num.charAt(i)){
                flag = i;
                num.setCharAt(i-1, (char) (num.charAt(i-1)-1));
            }
        }
        for(int i = flag; i < num.length(); i++){
            num.setCharAt(i, '9');
        }
        return Integer.parseInt(num.toString());

    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 1234\n
// @lcpr case=end

// @lcpr case=start
// 332\n
// @lcpr case=end

 */

