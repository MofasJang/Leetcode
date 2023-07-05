import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/*
 * @lc app=leetcode.cn id=491 lang=java
 * @lcpr version=21909
 *
 * [491] 递增子序列
 */
import java.util.Set;

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracing(nums, 0);
        return res;
    }
    public void backTracing(int[] nums, int start){
        if(path.size()>=2) res.add(new ArrayList<>(path));
        if(start == nums.length) return;
        Set<Integer> set = new HashSet<>();
        for(int i = start; i < nums.length; i++){
            if(set.contains(nums[i]) || (path.size() > 0 && nums[i] < path.get(path.size()-1))) continue;
            path.add(nums[i]);
            backTracing(nums, i+1);
            path.remove(path.size()-1);
            set.add(nums[i]);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,6,7,7]\n
// @lcpr case=end

// @lcpr case=start
// [4,4,3,2,1]\n
// @lcpr case=end

 */

