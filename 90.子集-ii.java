import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/*
 * @lc app=leetcode.cn id=90 lang=java
 * @lcpr version=21909
 *
 * [90] 子集 II
 */
import java.util.Set;

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTracing(nums, 0);
        return res;
    }
    public void backTracing(int[] nums, int start){
        res.add(new ArrayList<>(path));
        if(start == nums.length) return;
        int[] set = new int[21];
        for(int i = start; i < nums.length; i++){
            if(set[nums[i]+10] == 1) continue;
            path.add(nums[i]);
            backTracing(nums, i+1);
            path.remove(path.size()-1);
            set[nums[i]+10] = 1;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

