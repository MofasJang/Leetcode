import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=2475 lang=java
 * @lcpr version=21909
 *
 * [2475] 数组中不等三元组的数目
 */

// @lc code=start
class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0)+1);
        if(map.keySet().size() < 3) return 0;
        int result = 0, n = nums.length, t = 0;
        for(int key : map.keySet()){
            int k = map.get(key);
            result += k * t * (n - k - t);
            t += k;
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,4,2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

 */

