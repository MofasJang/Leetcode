import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 * @lcpr version=21909
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = s.length - 1;
        int res = 0;
        for (int i = g.length - 1; i >= 0 && j >= 0 ; i--) {
            if(g[i] <= s[j]){
                j--;
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[1,2,3]\n
// @lcpr case=end

 */

