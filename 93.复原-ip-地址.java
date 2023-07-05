import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 * @lcpr version=21909
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backTracing(s);
        return res;
    }
    public void backTracing(String s){
        if(path.size() == 4 && s.equals("")){
            res.add(path.get(0)+"."+path.get(1)+"."+path.get(2)+"."+path.get(3));
            return;
        }
        if(s.length() > 3 * (4 - path.size())) return;
        for(int len = 1; len <= Math.min(3,s.length()); len++){
            if(s.length() < 4 - path.size()) return;
            String cut = s.substring(0,len);
            if(cut.charAt(0) == '0' && len >= 2) return;
            if(Integer.parseInt(cut) > 255) return;
            path.add(cut);
            backTracing(s.substring(len));
            path.remove(path.size()-1);
        }
        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "25525511135"\n
// @lcpr case=end

// @lcpr case=start
// "0000"\n
// @lcpr case=end

// @lcpr case=start
// "101023"\n
// @lcpr case=end

 */

