import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=2611 lang=java
 * @lcpr version=21909
 *
 * [2611] 老鼠和奶酪
 */

// @lc code=start
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int sum = 0;
        for(int i : reward2) sum += i;
        int[] diffs = new int[reward1.length];
        for(int i = 0; i < reward1.length; i++) diffs[i] = reward1[i] - reward2[i];
        Arrays.sort(diffs);
        for(int i = reward1.length - k; i < reward1.length; i++) sum += diffs[i];
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,3,4]\n[4,4,1,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n[1,1]\n2\n
// @lcpr case=end

 */

