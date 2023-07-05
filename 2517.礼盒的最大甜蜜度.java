import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=2517 lang=java
 * @lcpr version=21908
 *
 * [2517] 礼盒的最大甜蜜度
 */

// @lc code=start
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0;
        int right = price[price.length-1] - price[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(isMax(price, k, mid)){
                left = mid;
            }
            else right = mid-1;
        }
        return left;
    }
    private boolean isMax(int[] price, int k, int tastiness){
        int pre = Integer.MIN_VALUE/2;
        int num = 0;
        for(int p : price){
            if(p - pre >= tastiness){
                pre = p;
                num++;
            }
        }
        return num >= k;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [13,5,1,8,21,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,3,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7]\n2\n
// @lcpr case=end

 */

