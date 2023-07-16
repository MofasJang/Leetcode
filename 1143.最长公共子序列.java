
/*
 * @lc app=leetcode.cn id=1143 lang=java
 * @lcpr version=21909
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // 动归
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        int res = 0;
        for(int i = 1; i <= text1.length(); i++) {
            for(int j = 1; j <= text2.length(); j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                if(dp[i][j] > res) {
                    res = dp[i][j];
                }
            }
        }
        return res;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcde"\n"ace"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n"def"\n
// @lcpr case=end

 */

