import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=205 lang=java
 * @lcpr version=21910
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap1 = new HashMap<>();
        HashMap<Character, Character> hashMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!hashMap1.containsKey(s.charAt(i))){
                hashMap1.put(s.charAt(i), t.charAt(i));
            }
            if (!hashMap2.containsKey(t.charAt(i))) {
                hashMap2.put(t.charAt(i), s.charAt(i));
            }
            if(hashMap1.get(s.charAt(i)) != t.charAt(i) || hashMap2.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "egg"\n"add"\n
// @lcpr case=end

// @lcpr case=start
// "foo"\n"bar"\n
// @lcpr case=end

// @lcpr case=start
// "paper"\n"title"\n
// @lcpr case=end

 */

