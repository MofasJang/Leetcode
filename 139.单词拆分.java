import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=139 lang=java
 * @lcpr version=21909
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int j = 1; j <= s.length(); j++){
            for(int i = 0; i < wordDict.size(); i++){
                int len = wordDict.get(i).length();
                if(j>=len && dp[j-len] && wordDict.get(i).equals(s.substring(j-len, j))){
                    dp[j] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode"\n["leet", "code"]\n
// @lcpr case=end

// @lcpr case=start
// "applepenapple"\n["apple", "pen"]\n
// @lcpr case=end

// @lcpr case=start
// "catsandog"\n["cats", "dog", "sand", "and", "cat"]\n
// @lcpr case=end

 */

