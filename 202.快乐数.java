import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 * @lcpr version=21908
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> happtset = new HashSet<>();
        while(!happtset.contains(n)){
            if(n==1) return true;
            happtset.add(n);
            int num = 0;
            while(n!=0){
                num += (n%10)*(n%10);
                n = n/10;
            }
            n = num;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 19\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

 */

