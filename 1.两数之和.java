import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1 lang=java
 * @lcpr version=21908
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> second = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            if(second.containsKey(nums[i])){
                result[0] = second.get(nums[i]);
                result[1] = i;
                break;
            }
            second.put(target-nums[i], i);
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,7,11,15]\n9\n
// @lcpr case=end

// @lcpr case=start
// [3,2,4]\n6\n
// @lcpr case=end

// @lcpr case=start
// [3,3]\n6\n
// @lcpr case=end

 */

