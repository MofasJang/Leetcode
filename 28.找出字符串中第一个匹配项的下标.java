/*
 * @lc app=leetcode.cn id=28 lang=java
 * @lcpr version=21908
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for(int i = 0; i < haystack.length(); i++){
            while(j>=0 && haystack.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if(haystack.charAt(i) == needle.charAt(j + 1)) j++;
            if(j == needle.length()-1){
                return i-j;
            }

        }
        return -1;
    }
    private void getNext(int[] next, String needle){
        int j = -1;
        next[0] = j;
        for(int i = 1; i < needle.length(); i++){
            while(j>=0 && needle.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if(needle.charAt(i) == needle.charAt(j + 1)) j++;
            next[i] = j;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "sadbutsad"\n"sad"\n
// @lcpr case=end

// @lcpr case=start
// "aabaabaaf"\n"aabaaf"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n"leeto"\n
// @lcpr case=end

 */

