import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1047 lang=java
 * @lcpr version=21908
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        char[] result = new char[stack.size()];
        for(int i = stack.size() - 1; i>=0; i--)
            result[i] = stack.pop();
        return new String(result);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abbaca"\n
// @lcpr case=end

 */

