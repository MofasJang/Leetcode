import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 * @lcpr version=21909
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracing(candidates, target, 0);
        return res;
    }
    public void backTracing(int[] candidates, int target, int cur){
        if(target == 0){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        int pre = -1;
        for(int i = cur; i < candidates.length; i++){
            if(pre >= 0 && candidates[pre] == candidates[i]) continue;
            if(target - candidates[i] < 0) return;
            path.add(candidates[i]);
            backTracing(candidates, target - candidates[i], i + 1);
            path.remove(path.size() - 1);
            pre = i;
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,1,2,7,6,1,5]\n8,\n
// @lcpr case=end

// @lcpr case=start
// [2,5,2,1,2]\n5,\n
// @lcpr case=end

 */

