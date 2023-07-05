import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=763 lang=java
 * @lcpr version=21909
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastPos = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastPos[s.charAt(i)-'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int first = 0;
        for(int i = 0; i < s.length(); i++) {
            max = Math.max(max, lastPos[s.charAt(i)-'a']);
            if(i == max){
                res.add(i+1-first);
                first = i+1;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ababcbacadefegdehijhklij"\n
// @lcpr case=end

// @lcpr case=start
// "eccbbbbdec"\n
// @lcpr case=end

 */

