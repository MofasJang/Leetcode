import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=516 lang=java
 * @lcpr version=21909
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }
        for(int j = 2; j <= s.length(); j++){
            for(int i = 0; i + j - 1 < s.length(); i++){
                if(s.charAt(i) == s.charAt(i + j - 1)){
                    dp[i][i + j - 1] = dp[i + 1][i + j - 2] + 2;
                }
                else{
                    dp[i][i + j - 1] = Math.max(dp[i + 1][i + j - 1], dp[i][i + j - 2]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// "bbbab"\n
// @lcpr case=end

// @lcpr case=start
// "cbbd"\n
// @lcpr case=end

 */

