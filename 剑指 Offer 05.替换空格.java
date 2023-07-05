/*
 * @lc app=leetcode.cn id=剑指 Offer 05 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 05] 替换空格
 */

// @lc code=start
class Solution {
    public String replaceSpace(String s) {
        StringBuilder add = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' '){
                add.append("  ");
            }
        }
        if(add.length() == 0) return s;
        
        int left = s.length() - 1;
        s += add;
        int right = s.length() - 1;
        char[] result = s.toCharArray();
        while(left >= 0){
            if(result[left] == ' '){
                result[right--] = '0';
                result[right--] = '2';
                result[right] = '%';
            }
            else{
                result[right] = result[left];
            }
            right --;
            left --;
        }
        return new String(result);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "We are happy."\n
// @lcpr case=end

 */

