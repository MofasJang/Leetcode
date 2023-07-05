/*
 * @lc app=leetcode.cn id=135 lang=java
 * @lcpr version=21909
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int num = ratings.length;
        int[] candyNum = new int[num];
        int res = 0;
        candyNum[0] = 1;
        for(int i = 0; i < num - 1; i++){
            if(ratings[i] < ratings[i + 1]) candyNum[i + 1] = candyNum[i] + 1;
            else candyNum[i + 1] = 1;
        }
        for(int i = num - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]) candyNum[i] = Math.max(candyNum[i + 1] + 1, candyNum[i]);
        }
        for (int i : candyNum) {
            res += i;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2]\n
// @lcpr case=end

 */

