/*
 * @lc app=leetcode.cn id=941 lang=java
 * @lcpr version=21909
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        int cut = 0;
        while(cut < arr.length - 1 && arr[cut] < arr[cut + 1]) {
            cut++;
        }
        if(cut == arr.length - 1 || cut == 0) {
            return false;
        }
        while(cut < arr.length - 1 && arr[cut] > arr[cut + 1]) {
            cut++;
        }
        if(cut == arr.length - 1) {
            return true;
        }
        else {
            return false;
        }
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,5,5]\n
// @lcpr case=end

// @lcpr case=start
// [0,3,2,1]\n
// @lcpr case=end

 */

