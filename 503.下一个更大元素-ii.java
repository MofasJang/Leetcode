import java.util.Stack;

/*
 * @lc app=leetcode.cn id=503 lang=java
 * @lcpr version=21909
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = -1;
        }
        stack.push(0);
        for(int i = 0; i < 2 * nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]){
                int pop = stack.pop();
                res[pop] = nums[i % nums.length];
            }
            stack.push(i % nums.length);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,3]\n
// @lcpr case=end

 */

