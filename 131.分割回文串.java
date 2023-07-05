import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=131 lang=java
 * @lcpr version=21909
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracing(s);
        return res;
    }
    public void backTracing(String s){
        if(s.length() == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 1; i <= s.length(); i++){
            if(!isRound(s.substring(0, i))) continue;
            path.add(s.substring(0, i));
            backTracing(s.substring(i));
            path.remove(path.size()-1);
        }
        return;
    }
    public boolean isRound(String s){
        int len = s.length();
        if(len == 1) return true;
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aab"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

 */

