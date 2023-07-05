import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1005 lang=java
 * @lcpr version=21909
 *
 * [1005] K 次取反后最大化的数组和
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        fastSort(nums, 0, nums.length-1);
        int res = 0;
        for (int i = 0; i < nums.length && k > 0; i++) {
            if(nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        if(k > 0) nums[nums.length - 1] = (int) (nums[nums.length - 1] * Math.pow(-1, k));
        for (int i : nums) {
            res += i;
        }
        return res;
    }
    private void fastSort(int[] nums, int left, int right){
        int i,j,pivot;
        if(left >= right) return;
        i = left;
        j = right;
        pivot = nums[left];
        while(i < j){
            while(Math.abs(nums[j]) <= Math.abs(pivot) && i < j) j--;
            while(Math.abs(nums[i]) >= Math.abs(pivot) && i < j) i++;
            if(i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[left] = nums[i];
        nums[i] = pivot;
        fastSort(nums, left, i-1);
        fastSort(nums, i+1, right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [3,-1,0,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [2,-3,-1,5,-4]\n2\n
// @lcpr case=end

 */

