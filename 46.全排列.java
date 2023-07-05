import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
/*
 * @lc app=leetcode.cn id=46 lang=java
 * @lcpr version=21909
 *
 * [46] 全排列
 */


// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backTracing(nums);
        return res;
    }
    public void backTracing(int[] num){
        if(path.size() == num.length){
            res.add(new ArrayList<>(path));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < num.length; i++){
            if(used[i] || set.contains(num[i])) continue;
            used[i] = true;
            set.add(num[i]);
            path.add(num[i]);
            backTracing(num);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

