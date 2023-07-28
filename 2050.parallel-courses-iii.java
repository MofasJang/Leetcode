import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=2050 lang=java
 * @lcpr version=21912
 *
 * [2050] 并行课程 III
 */

// @lc code=start
class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<Integer>[] prev = new List[n+1];
        for(int i = 0; i < n; i++) {
            prev[i + 1] = new ArrayList<Integer>();
        }
        for(int[] r : relations) {
            prev[r[1]].add(r[0]);
        }
        int res = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            res = Math.max(res, dp(i, prev, time, memo));
        }
        return res;
    }
    private int dp(int i, List<Integer>[] prev, int[] time, Map<Integer,Integer> memo) {
        if(!memo.containsKey(i)) {
            int res = 0;
            if(!prev[i].isEmpty()) {
                for(int j = 0; j < prev[i].size(); j++) {
                    res = Math.max(res, dp(prev[i].get(j), prev, time, memo));
                }           
            }
            res += time[i - 1];
            memo.put(i, res);
            return res;
        }
        else {
            return memo.get(i);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[1,3],[2,3]]\n[3,2,5]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[1,5],[2,5],[3,5],[3,4],[4,5]]\n[1,2,3,4,5]\n
// @lcpr case=end

 */

