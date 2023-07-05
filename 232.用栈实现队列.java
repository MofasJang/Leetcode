import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 * @lcpr version=21908
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {

    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        Stack<Integer> stack2 = new Stack<Integer>();
        while(!stack.empty()){
            stack2.push(stack.pop());
        }
        stack.push(x);
        while(!stack2.empty()){
            stack.push(stack2.pop());
        }
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end



/*
// @lcpr case=start
// ["MyQueue", "push", "push", "peek", "pop", "empty"][[], [1], [2], [], [], []]\n
// @lcpr case=end

 */

