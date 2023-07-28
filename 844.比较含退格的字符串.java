import java.util.Stack;

/*
 * @lc app=leetcode.cn id=844 lang=java
 * @lcpr version=21910
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> res1 = backspace(s);
        Stack<Character> res2 = backspace(t);
        while(!res1.isEmpty() && !res2.isEmpty()) {
            if(res1.pop() != res2.pop()) {
                return false;
            }
        }
        if(!res1.isEmpty() || !res2.isEmpty()) {
            return false;
        }
        return true;
    }
    public Stack<Character> backspace(String s) {
        Stack<Character> res = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c != '#') {
                res.push(c);
            }
            else if(!res.isEmpty()) {
                res.pop();
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ab#c"\n"ad#c"\n
// @lcpr case=end

// @lcpr case=start
// "ab##"\n"c#d#"\n
// @lcpr case=end

// @lcpr case=start
// "a#c"\n"b"\n
// @lcpr case=end

 */

