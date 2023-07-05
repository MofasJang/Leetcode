import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 * @lcpr version=21909
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracing(n, k, 1);
        return res;
    }
    public void backTracing(int n, int k, int i){
        if(path.size() == k){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int j = i; j <= n - (k - path.size()) + 1; j++){
            path.add(j);
            backTracing(n, k, j+1);
            path.remove(path.size()-1);
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n2\n
// @lcpr case=end

// @lcpr case=start
// 1\n1\n
// @lcpr case=end

 */

