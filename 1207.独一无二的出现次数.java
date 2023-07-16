import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1207 lang=java
 * @lcpr version=21909
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for(Integer i : hashMap.keySet()) {
            if(hashSet.contains(hashMap.get(i))) {
                return false; 
            }
            else{
                hashSet.add(hashMap.get(i));
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [-3,0,1,-3,1,1,1,-3,10,0]\n
// @lcpr case=end

 */

