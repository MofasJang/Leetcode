import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 * @lcpr version=21908
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> stack;
    public MyStack() {
        stack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        Queue<Integer> queue =  new ArrayDeque<Integer>();
        while(!stack.isEmpty()){
            queue.add(stack.poll());
        }
        stack.add(x);
        while(!queue.isEmpty()){
            stack.add(queue.poll());
        }
    }
    
    public int pop() {
        return stack.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end



/*
// @lcpr case=start
// ["MyStack", "push", "push", "top", "pop", "empty"][[], [1], [2], [], [], []]\n
// @lcpr case=end

 */

