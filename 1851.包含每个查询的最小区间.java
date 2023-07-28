import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1851 lang=java
 * @lcpr version=21910
 *
 * [1851] 包含每个查询的最小区间
 */

// @lc code=start
class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Integer[] qindex = new Integer[queries.length];
        for(int i = 0; i < qindex.length; i++) {
            qindex[i] = i;
        }
        Arrays.sort(qindex,(a,b)-> queries[a] - queries[b]);
        Arrays.sort(intervals,(a,b)->{
            return a[0] - b[0];
        });
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[0] - b[0]);
        int[] res = new int[queries.length];
        Arrays.fill(res, -1);
        int i = 0;
        for(int q : qindex) {
            while(i < intervals.length && intervals[i][0] <= queries[q]) {
                queue.offer(new int[]{intervals[i][1] - intervals[i][0] + 1, intervals[i][1]});
                i++;
            }
            while(!queue.isEmpty() && queue.peek()[1] < queries[q]) {
                queue.poll();
            }
            if(!queue.isEmpty()) {
                res[q] = queue.peek()[0];
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,4],[2,4],[3,6],[4,4]]\n[2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [[2,3],[2,5],[1,8],[20,25]]\n[2,19,5,22]\n
// @lcpr case=end

 */

