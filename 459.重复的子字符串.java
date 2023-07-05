/*
 * @lc app=leetcode.cn id=459 lang=java
 * @lcpr version=21908
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int lenth = 1; lenth <= s.length()/2; lenth++){
            int start = 0;
            String patten = s.substring(0, lenth);
            start += lenth;
            while(start <= s.length()-lenth){
                System.out.println(start);
                if(s.substring(start, start + lenth).equals(patten))
                    start += lenth;
                else break;
            }
            if(start == s.length()) return true;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abab"\n
// @lcpr case=end

// @lcpr case=start
// "aba"\n
// @lcpr case=end

// @lcpr case=start
// "abcabcabcabc"\n
// @lcpr case=end

 */

