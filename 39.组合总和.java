import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 * @lcpr version=21909
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracing(candidates, target, candidates[0]);
        return res;
    }
    public void backTracing(int[] candidates, int target, int cur){
        if(target == 0){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i : candidates){
            if(i < cur) continue;
            if(target - i < 0) return;
            path.add(i);
            backTracing(candidates, target - i, i);
            path.remove(path.size() - 1);
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,6,7]\n7\n
// @lcpr case=end

// @lcpr case=start
// [2,3,5]\n8\n
// @lcpr case=end

// @lcpr case=start
// [2]\n1\n
// @lcpr case=end

 */

