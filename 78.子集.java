import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 * @lcpr version=21909
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracing(nums, 0);
        return res;
    }
    public void backTracing(int[] nums, int start){
        res.add(new ArrayList<>(path));
        if(start == nums.length) return;
        for(int i = start; i < nums.length; i++){
            path.add(nums[i]);
            backTracing(nums, i+1);
            path.remove(path.size()-1);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

