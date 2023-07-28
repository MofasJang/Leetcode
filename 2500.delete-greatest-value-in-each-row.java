import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2500 lang=java
 * @lcpr version=21912
 *
 * [2500] 删除每行中的最大值
 */

// @lc code=start
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            Arrays.sort(grid[i]);
        }
        int res = 0;
        for(int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for(int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            res += max;
        }
        return res;
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,4],[3,3,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[10]]\n
// @lcpr case=end

 */

