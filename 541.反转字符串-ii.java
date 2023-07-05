/*
 * @lc app=leetcode.cn id=541 lang=java
 * @lcpr version=21908
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] result = s.toCharArray();
        for(int i = 0; i < s.length(); i += 2 * k){
            int start = i;
            int end = Math.min(start + k - 1 , s.length() - 1);
            while(start < end){
                char temp = result[start];
                result[start] = result[end];
                result[end] = temp;
                start ++;
                end --;
            }
        }
        return new String(result);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcdefg"\n2\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n2\n
// @lcpr case=end

 */

