import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=349 lang=java
 * @lcpr version=21908
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int n : nums1){
            s1.add(n);
        }
        for(int n : nums2){
            if(s1.contains(n)){
                result.add(n);
            }
        }
        // int[] resultArray = new int[result.size()];
        // int j = 0;
        // for(int i : result){
        //     resultArray[j++] = i;
        // }
        // return resultArray;
        return result.stream().mapToInt(x->x).toArray();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1]\n[2,2]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,5]\n[9,4,9,8,4]\n
// @lcpr case=end

 */

