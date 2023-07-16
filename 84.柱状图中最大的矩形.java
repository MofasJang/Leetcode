import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=84 lang=java
 * @lcpr version=21909
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] height_ = new int[heights.length + 2];
        System.arraycopy(heights, 0, height_, 1, heights.length);
        int res = 0;
        stack.push(0);
        for(int i = 1; i < height_.length; i++){
            while(height_[stack.peek()] > height_[i]){
                int pop = stack.pop();
                res = Math.max(res,height_[pop] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,5,6,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,4]\n
// @lcpr case=end

 */

