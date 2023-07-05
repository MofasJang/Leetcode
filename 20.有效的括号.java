import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 * @lcpr version=21908
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        Stack<Character> kuohao = new Stack<>();
        for(char c : s.toCharArray()){
            if(isLeft(c)) kuohao.push(c);
            else{
                if(kuohao.isEmpty()) return false;
                if(isDirect(kuohao.peek(),c)) kuohao.pop();
                else kuohao.push(c);
            }
        }
        if(kuohao.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isLeft(char c){
        if(c == '(' || c == '[' || c == '{') return true;
        else return false;
    }
    private boolean isDirect(char c, char d){
        if(c == '(' && d == ')' || c == '[' && d == ']' || c == '{' && d == '}') return true;
        else return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "()[]{}"\n
// @lcpr case=end

// @lcpr case=start
// "(]"\n
// @lcpr case=end

 */

