/*
 * @lc app=leetcode.cn id=18 lang=java
 * @lcpr version=21908
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(nums[i] > 0 && nums[i] > target) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum > target) right--;
                    else if(sum < target) left++;
                    else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(right>left && nums[right] == nums[right-1]) right--;
                        while(right>left && nums[left] == nums[left+1]) left++;
                        right--;
                        left++;
                }
                }
            }
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,-1,0,-2,2]\n0\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,2,2]\n8\n
// @lcpr case=end

 */

