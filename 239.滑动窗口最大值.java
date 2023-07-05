import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=239 lang=java
 * @lcpr version=21908
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class SlidWindow{
    Deque<Integer> deque = new LinkedList<Integer>();
    public void add(int i){
        while(!deque.isEmpty() && deque.getLast() < i)
            deque.removeLast();
        deque.add(i);
    }
    public void poll(int i){
        if(!deque.isEmpty() && deque.peek() == i)
            deque.poll();
    }
    public int peak(){
        return deque.peek();
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        int num = 0;
        int[] res = new int[nums.length - k + 1];
        SlidWindow slidWindow = new SlidWindow();
        for(int i = 0; i < k; i ++){
            slidWindow.add(nums[i]);
        }
        res[num++] = slidWindow.peak();
        for(int i = k; i < nums.length; i++){
            slidWindow.poll(nums[i-k]);
            slidWindow.add(nums[i]);
            res[num++] = slidWindow.peak();
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,-1,-3,5,3,6,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

 */

