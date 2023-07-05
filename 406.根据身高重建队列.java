import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=406 lang=java
 * @lcpr version=21909
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0] == b[0]) return a[1] - b[1];
            else return b[0] - a[0];
        });
        LinkedList<int[]> res = new LinkedList<>();
        for (int[] i : people) {
            res.add(i[1], i);
        }
        return res.toArray(new int[people.length][]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]\n
// @lcpr case=end

 */

