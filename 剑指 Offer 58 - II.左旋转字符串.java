/*
 * @lc app=leetcode.cn id=剑指 Offer 58 - II lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 58 - II] 左旋转字符串
 */

// @lc code=start
class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] r = s.toCharArray();
        reverseChars(r, 0, n-1);
        reverseChars(r, n, s.length()-1);
        reverseChars(r, 0, s.length()-1);
        return new String(r);
    }

    private void reverseChars(char[] cs, int start, int end){
        while(start < end){
            char temp = cs[start];
            cs[start] = cs[end];
            cs[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcdefg"\n2\n
// @lcpr case=end

// @lcpr case=start
// "lrloseumgh"\n6\n
// @lcpr case=end

 */

