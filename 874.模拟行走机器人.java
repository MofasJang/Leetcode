import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=874 lang=java
 * @lcpr version=21910
 *
 * [874] 模拟行走机器人
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer, List<Integer>> xMap = new HashMap<>();
        HashMap<Integer, List<Integer>> yMap = new HashMap<>();
        for(int[] obstacle : obstacles) {
            List<Integer> xvalue = xMap.getOrDefault(obstacle[0], new ArrayList<>());
            xvalue.add(obstacle[1]);
            xMap.put(obstacle[0], xvalue);
            List<Integer> yvalue = yMap.getOrDefault(obstacle[1], new ArrayList<>());
            yvalue.add(obstacle[0]);
            yMap.put(obstacle[1], yvalue);
        }
        int res = 0;
        int[] pos = new int[]{0,0};
        int direc = 0;
        for(int c : commands) {
            if(c == -2) {
                direc = (direc + 3) % 4;
            }
            else if(c == -1) {
                direc = (direc + 1) % 4;
            }
            else{
                if(direc % 2 == 1){
                    int x = (int) (c * Math.round(Math.sin(direc * Math.PI / 2)));
                    pos[0] = afterObstacle(pos[0], x, yMap.getOrDefault(pos[1], null));
                }
                else{
                    int y = (int) (c * Math.round(Math.cos(direc * Math.PI / 2)));
                    pos[1] = afterObstacle(pos[1], y, xMap.getOrDefault(pos[0], null));
                }
            }
            res = Math.max(res, pos[0] * pos[0] + pos[1] * pos[1]);
        }
        return res;
    }
    public int afterObstacle(int pos, int len, List<Integer> values) {
        if(values == null) {
            return pos + len;
        }
        if(len > 0) {
            values.sort((a,b) -> a - b);
            for(int i = 0; i < values.size(); i++) {
                if(pos < values.get(i) && pos + len >= values.get(i)) {
                    return values.get(i) - 1;
                }
            }
        }
        else{
            values.sort((a,b) -> b - a);
            for(int i = 0; i < values.size(); i++) {
                if(pos > values.get(i) && pos + len <= values.get(i)) {
                    return values.get(i) + 1;
                }
            }
        }
        return pos + len;
    }
}

// @lc code=end



/*
// @lcpr case=start
// [4,-1,3]\n[]\n
// @lcpr case=end

// @lcpr case=start
// [4,-1,4,-2,4]\n[[2,4],[2,5]]\n
// @lcpr case=end

 */

