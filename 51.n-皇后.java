import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=51 lang=java
 * @lcpr version=21909
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    List<List<String>> res = new ArrayList<>();
    int[] path;
    public List<List<String>> solveNQueens(int n) {
        path = new int[n];
        backTracing(n, 0);
        return res;
    }
    public void backTracing(int n, int line){
        if(path[n-1] != 0){
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < n; j++){
                    if(j == path[i] - 1) s.append('Q');
                    else s.append('.');
                }
                list.add(s.toString());
            }
            res.add(list);
            return;
        }
        for(int i = 0; i < n; i++){
            boolean pass = false;
            for(int j = 0; j < line; j++){
                if(i == path[j] - 1 || Math.abs(path[j] - 1 - i) == Math.abs(line - j)){
                    pass = true;
                    break;
                }
            }
            if(pass) continue;
            path[line] = i + 1;
            backTracing(n, line + 1);
            path[line] = 0;
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

