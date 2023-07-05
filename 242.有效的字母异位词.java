import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 * @lcpr version=21908
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        
        for(char i : s.toCharArray()){
            num1[i-97]++;
        }
        for(char i : t.toCharArray()){
            num2[i-97]++;
        }
        for(int i=0; i<26; i++){
            if(num1[i] != num2[i]){
                return false;
            }
        }
        return true;


    }
}
// @lc code=end



/*
// @lcpr case=start
// "anagram"\n"nagaram"\n
// @lcpr case=end

// @lcpr case=start
// "rat"\n"car"\n
// @lcpr case=end

 */

