import java.util.Stack;

/*
 * @lc app=leetcode.cn id=42 lang=java
 * @lcpr version=21909
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        stack.push(0);
        for(int i = 1; i < height.length; i++){
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int pop = stack.pop();
                if(!stack.isEmpty()){
                    res += (Math.min(height[stack.peek()], height[i]) - height[pop]) * (i - stack.peek() - 1);
                }
            }
            stack.push(i);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,0,2,1,0,1,3,2,1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [4,2,0,3,2,5]\n
// @lcpr case=end

 */

