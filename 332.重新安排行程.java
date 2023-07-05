import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=332 lang=java
 * @lcpr version=21909
 *
 * [332] 重新安排行程
 */

// @lc code=start
class Solution {
    List<String> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    boolean[] used;
    public List<String> findItinerary(List<List<String>> tickets) {
        used = new boolean[tickets.size()];
        Collections.sort(tickets,(a,b) -> a.get(1).compareTo(b.get(1)));
        path.add("JFK");
        backTracing(tickets, "JFK");
        return result;
    }
    public boolean backTracing(List<List<String>> tickets, String next){
        if(path.size() == tickets.size() + 1){
            result = new ArrayList<>(path);
            return true;
        }
        for(int i = 0; i < tickets.size(); i++){
            if(used[i] || !tickets.get(i).get(0).equals(next)) continue;
            used[i] = true;
            path.add(tickets.get(i).get(1));
            if(backTracing(tickets, tickets.get(i).get(1))) return true;
            path.remove(path.size()-1);
            used[i] = false;
        }
        return false;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]\n
// @lcpr case=end

// @lcpr case=start
// [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]\n
// @lcpr case=end

 */

