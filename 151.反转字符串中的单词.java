/*
 * @lc app=leetcode.cn id=151 lang=java
 * @lcpr version=21908
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        int end = s.length() - 1;
        int start = end;
        while(end >= 0){
            if(s.charAt(end) == ' '){
                end --;
                continue;
            }
            start = end;
            while(start >= 0){
                if(start > 0 && s.charAt(start-1) == ' ' || start == 0){
                    if(builder.length() == 0){
                        builder.append(s.substring(start, end+1));
                    }
                    else{
                        builder.append(" "+s.substring(start, end+1));
                    }
                    end = start-1;
                    break;
                }
                start --;
            }
        }
        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "the sky is blue"\n
// @lcpr case=end

// @lcpr case=start
// "  hello world  "\n
// @lcpr case=end

// @lcpr case=start
// "a good   example"\n
// @lcpr case=end

 */

