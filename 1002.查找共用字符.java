import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1002 lang=java
 * @lcpr version=21910
 *
 * [1002] 查找共用字符
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] words) {
        int[] HashMap = new int[26];
        for(int i = 0; i < words.length; i++) {
            int[] hashMap = new int[26];
            for (char c : words[i].toCharArray()) {
                hashMap[c - 'a'] += 1;
            }
            if(i == 0) {
                HashMap = hashMap;
            }
            else{
                for(int j = 0; j < 26; j++) {
                    HashMap[j] = Math.min(hashMap[j], HashMap[j]);
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < HashMap[i]; j++) {
                res.add(String.valueOf((char)('a' + i)));
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["bella","label","roller"]\n
// @lcpr case=end

// @lcpr case=start
// ["cool","lock","cook"]\n
// @lcpr case=end

 */

