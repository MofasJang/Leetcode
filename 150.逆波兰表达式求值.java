/*
 * @lc app=leetcode.cn id=150 lang=java
 * @lcpr version=21908
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }
            else if(c.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if(c.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }   
            else if(c.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } 
            else{
                stack.push(Integer.parseInt(c));
            }     
        }
        return stack.pop();
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["2","1","+","3","*"]\n
// @lcpr case=end

// @lcpr case=start
// ["4","13","5","/","+"]\n
// @lcpr case=end

// @lcpr case=start
// ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]\n
// @lcpr case=end

 */

