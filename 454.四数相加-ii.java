import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=454 lang=java
 * @lcpr version=21908
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            for(int j : nums2){
                map.put(i+j, map.getOrDefault(i+j, 0)+1);
            }
        }
        int count = 0;
        for(int i : nums3){
            for(int j : nums4){
                count += map.getOrDefault(0-i-j,0);
            }
        }
        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2]\n[-2,-1]\n[-1,2]\n[0,2]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n[0]\n[0]\n[0]\n
// @lcpr case=end

 */

