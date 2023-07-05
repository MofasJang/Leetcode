/*
 * @lc app=leetcode.cn id=860 lang=java
 * @lcpr version=21909
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i : bills) {
            if(i == 5) five++;
            else if(i == 10) {
                five--;
                ten++;
            }
            else{
                if(ten > 0){
                    five--;
                    ten--;
                }
                else{
                    five -= 3;
                }
                
            }
            if(five < 0 || ten < 0) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,5,5,10,20]\n
// @lcpr case=end

// @lcpr case=start
// [5,5,10,10,20]\n
// @lcpr case=end

 */

