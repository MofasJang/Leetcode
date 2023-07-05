import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=474 lang=java
 * @lcpr version=21909
 *
 * [474] 一和零
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] count = new int[strs.length][2];
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs[i].length(); j++){
                if(strs[i].charAt(j) == '0') count[i][0]++;
                else count[i][1]++;
            }
        }
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < strs.length; i++){
            for(int j = m; j >= count[i][0]; j--){
                for(int k = n; k >= count[i][1]; k--){
                    dp[j][k] = Math.max(dp[j][k], dp[j-count[i][0]][k-count[i][1]]+1);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["10", "0001", "111001", "1", "0"]\n5\n3\n
// @lcpr case=end

// @lcpr case=start
// ["10", "0", "1"]\n1\n1\n
// @lcpr case=end

 */

