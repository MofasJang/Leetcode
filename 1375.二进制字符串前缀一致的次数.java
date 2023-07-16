
/*
 * @lc app=leetcode.cn id=1375 lang=java
 * @lcpr version=21909
 *
 * [1375] 二进制字符串前缀一致的次数
 */

// @lc code=start
class Solution {
    public int numTimesAllBlue(int[] flips) {
        int n = flips.length;
        int max = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, flips[i]);
            if(max == i+1) res++;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,4,1,5]\n
// @lcpr case=end

// @lcpr case=start
// [4,1,2,3]\n
// @lcpr case=end

 */

