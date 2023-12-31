import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=63 lang=java
 * @lcpr version=21909
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < n && obstacleGrid[0][i] == 0; i++) dp[0][i] = 1;
        for(int i = 0; i < m && obstacleGrid[i][0] == 0; i++) dp[i][0] = 1;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                    continue; 
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,0,0],[0,1,0],[0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,1],[0,0]]\n
// @lcpr case=end

 */

