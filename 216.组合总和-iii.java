import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 * @lcpr version=21909
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracing(k,n,1);
        return res;
    }
    public void backTracing(int k, int n, int i){
        if(path.size() == k){
            if(n == 0) res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int j = i; j <= 9; j++){
            if(n-j < 0) return;
            path.add(j);
            backTracing(k, n-j, j+1);
            path.remove(path.size()-1);
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n7\n
// @lcpr case=end

// @lcpr case=start
// 3\n9\n
// @lcpr case=end

// @lcpr case=start
// 4\n1\n
// @lcpr case=end

 */

