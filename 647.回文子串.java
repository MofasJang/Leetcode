import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=647 lang=java
 * @lcpr version=21909
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }
        int res = s.length();
        for(int j = 2; j <= s.length(); j++){
            for(int i = 0; i + j - 1 < s.length(); i++){
                if(s.charAt(i) == s.charAt(i + j - 1)){
                    if(j == 2 || dp[i + 1][i + j - 2] == true){
                        res++;
                        dp[i][i + j - 1] = true;
                    }
                }
            } 
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n
// @lcpr case=end

 */

