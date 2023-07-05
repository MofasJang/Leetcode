import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=383 lang=java
 * @lcpr version=21908
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] wordmap = new int[26];
        if(ransomNote.length()>magazine.length()) return false;
        for(char c : magazine.toCharArray()){
            wordmap[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            wordmap[c - 'a']--;
        }
        for(int i = 0; i<26; i++){
            if(wordmap[i]<0) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a"\n"b"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"ab"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"aab"\n
// @lcpr case=end

 */

