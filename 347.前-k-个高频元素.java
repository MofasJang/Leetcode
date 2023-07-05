import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=347 lang=java
 * @lcpr version=21908
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public static class Node{
        public int num;
        public int freq;
        public Node(int num){
            this.num = num;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> total = new HashSet<>();
        for(int i : nums) total.add(i);
        int len = total.size();
        Node[] sum = new Node[len];
        for(int j = 0; j < len; j++) sum[j] = new Node(to);
        for(int j : nums){ 
            sum[j-1].freq++;
        }
        Arrays.sort(sum,new freqAscend());
        int[] result = new int[k];
        for(int j = 0; j < k; j++)
            result[j] = sum[j].num;
        return result;
        
    }
    public static class freqAscend implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o2.freq - o1.freq ;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1,2,2,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

 */

