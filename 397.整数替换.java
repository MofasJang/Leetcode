/*
 * @lc app=leetcode.cn id=397 lang=java
 * @lcpr version=21909
 *
 * [397] 整数替换
 */

// @lc code=start
class Solution {
    public int integerReplacement(int n) {
        long _n = n;
        int res = 0;
        while(_n!=1){
            if(_n%2 == 0){
                _n = _n >> 1;
            }
            else{
                if(_n!=3 && ((_n>>1)&1) == 1) _n++;
                else _n--;
            }
            res++;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 8\n
// @lcpr case=end

// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

 */

