import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=452 lang=java
 * @lcpr version=21909
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        int res = 1;
        Arrays.sort(points,(a,b)->{
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        int[] temp = points[0];
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > temp[1] || points[i][1] < temp[0]){
                temp = points[i];
                res++;
            }
            else{
                temp[0] = Math.max(temp[0], points[i][0]);
                temp[1] = Math.min(temp[1], points[i][1]);
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[10,16],[2,8],[1,6],[7,12]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2],[3,4],[5,6],[7,8]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2],[2,3],[3,4],[4,5]]\n
// @lcpr case=end

 */

