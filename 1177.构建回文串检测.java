import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1177 lang=java
 * @lcpr version=21909
 *
 * [1177] 构建回文串检测
 */

// @lc code=start
class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int len = s.length();
        int[] count = new int[len+1];
        for(int i = 0; i < len; i++){
            count[i+1] = count[i] ^ (int)(1 << s.charAt(i) - 'a');
        }
        List<Boolean> res = new ArrayList<>();
        for(int[] querie : queries){
            int l = querie[0], r = querie[1], k = querie[2];
            int querieCount = count[l] ^ count[r+1];
            int odd = 0;
            while(querieCount != 0){
                if(querieCount % 2 == 1) odd++;
                querieCount /= 2;
            }
            res.add(odd/2 <= k);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcda"\n[[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]]\n
// @lcpr case=end

 */

