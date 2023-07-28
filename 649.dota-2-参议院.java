/*
 * @lc app=leetcode.cn id=649 lang=java
 * @lcpr version=21910
 *
 * [649] Dota2 参议院
 */

// @lc code=start
class Solution {
    public String predictPartyVictory(String senate) {
        StringBuffer sb = new StringBuffer(senate);
        while(sb.length() > 1) {
            boolean changed = false;
            for(int i = 0; i < sb.length(); i++) {
                boolean changed1 = false;
                for(int j = i + 1; j < sb.length(); j++) {
                    if(sb.charAt(j) != sb.charAt(i)) {
                        sb.delete(j, j + 1);
                        changed = true;
                        changed1 = true;
                        break;
                    }
                }
                if(!changed1){
                    for(int j = 0; j < i; j++) {
                        if(sb.charAt(j) != sb.charAt(i)) {
                            sb.delete(j, j + 1);
                            changed = true;
                            break;
                        }
                    }
                }
            }
            if(!changed) {
                break;
            }
        }
        if(sb.charAt(0) == 'R') {
            return "Radiant";
        }
        return "Dire";
    }
}
// @lc code=end



/*
// @lcpr case=start
// "RD"\n
// @lcpr case=end

// @lcpr case=start
// "RDD"\n
// @lcpr case=end

 */

