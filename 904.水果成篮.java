import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=904 lang=java
 * @lcpr version=21908
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < fruits.length; right++){
            temp.put(fruits[right], temp.getOrDefault(fruits[right], 0)+1);
            while(temp.size()>2){
                temp.put(fruits[left], temp.get(fruits[left])-1);
                if(temp.get(fruits[left]) == 0){
                    temp.remove(fruits[left]);
                }
                left ++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,3,1,2,1,1,2,3,3,4]\n
// @lcpr case=end

 */

