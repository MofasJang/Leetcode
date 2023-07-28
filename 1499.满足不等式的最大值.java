import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1499 lang=java
 * @lcpr version=21910
 *
 * [1499] 满足不等式的最大值
 */

// @lc code=start
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        int res = Integer.MIN_VALUE;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->b[0] - a[0]);
        for(int i = 0; i < n; i++) {
            while(!queue.isEmpty() && points[i][0] - queue.peek()[1] > k) {
                queue.poll();
            }
            if(!queue.isEmpty()){
                res = Math.max(res, points[i][0] + points[i][1] + queue.peek()[0]);
            }
            queue.add(new int[]{points[i][1] - points[i][0], points[i][0]});
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,0],[5,10],[6,-10]]\n1\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[3,0],[9,2]]\n3\n
// @lcpr case=end

 */
