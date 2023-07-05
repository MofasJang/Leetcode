import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=435 lang=java
 * @lcpr version=21909
 *
 * [435] 无重叠区间
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals,(a,b)->{
            return a[1] - b[1];
        });
        int temp = Integer.MIN_VALUE;
        for (int[] inter : intervals) {
            if(temp <= inter[0]){
                temp = inter[1];
            }
            else{
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[2,3],[3,4],[1,3]]\n
// @lcpr case=end

// @lcpr case=start
// [ [1,2], [1,2], [1,2] ]\n
// @lcpr case=end

// @lcpr case=start
// [ [1,2], [2,3] ]\n
// @lcpr case=end

 */

