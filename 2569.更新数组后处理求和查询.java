import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=2569 lang=java
 * @lcpr version=21912
 *
 * [2569] 更新数组后处理求和查询
 */

// @lc code=start
class Solution {
    public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        ArrayList<Long> res = new ArrayList<>();
        long sum = 0;
        long sum2 = 0;
        for(int i : nums2) {
            sum2 += i;
        }
        for(int[] querie : queries) {
            if(querie[0] == 1) {
                for(int i = querie[1]; i <= querie[2]; i++) {
                    nums1[i] ^= 1;
                }
            }
            else if(querie[0] == 2) {
                int ones = 0;
                for(int i : nums1) {
                    ones += i;
                }
                sum += querie[1] * ones;

            }
            else{
                if(res.isEmpty()) {
                    res.add((long) (sum2 + sum));
                }
                else{
                    res.add(res.get(res.size()-1) + sum);
                }
                sum = 0;
            }
        }
        return res.stream().mapToLong(a->a).toArray();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,1]\n[0,0,0]\n[[1,1,1],[2,1,0],[3,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n[5]\n[[2,0,0],[3,0,0]]\n
// @lcpr case=end

 */

