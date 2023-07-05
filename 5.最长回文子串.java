
/*
 * @lc app=leetcode.cn id=5 lang=java
 * @lcpr version=21907
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] P = new boolean[n][n];
        String longest_palindrome = "";
        if(n<2){
            return s;
        }
        for(int i=0 ; i<n ; i++){
            P[i][i] = true;
        }
        for(int i=0 ; i<n-1 ; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                P[i][i+1]=true;
                longest_palindrome = s.substring(i, i+2);
            }
        }
        for(int length=3; length<n+1; length++ ){
            for(int i=0; i<n-length-1 ; i++){
                int j = i+length-1;
                if(s.charAt(i)==s.charAt(j) & P[i+1][j-1]){
                    P[i][j] = true;
                    longest_palindrome = s.substring(i, j+1);
                }
            }
        }
        return longest_palindrome;
    }

}
// @lc code=end

/*
 * // @lcpr case=start
 * // "babad"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "cbbd"\n
 * // @lcpr case=end
 * 
 */
