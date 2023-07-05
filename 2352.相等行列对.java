import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.FactoryConfigurationError;

/*
 * @lc app=leetcode.cn id=2352 lang=java
 * @lcpr version=21908
 *
 * [2352] 相等行列对
 */

// @lc code=start
class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> rowsHash = new HashMap<>();
        for(int[] row : grid){
            List<Integer> rowList = new ArrayList<>();
            for(int i : row){
                rowList.add(i);
            }
            rowsHash.put(rowList, rowsHash.getOrDefault(rowList, 0)+1);
        }
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j < grid.length; j++){
                arr.add(grid[j][i]);
            }
            if(rowsHash.containsKey(arr)) res += rowsHash.get(arr);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,2,1],[1,7,6],[2,7,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]\n
// @lcpr case=end

 */

