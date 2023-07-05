import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 * @lcpr version=21909
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder word = new StringBuilder();
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return res;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTracing(digits);
        return res;
    }
    public void backTracing(String digits){
        if(digits.equals("")){
            res.add(word.toString());
            return;
        }

        for(char c : map.get(digits.charAt(0)).toCharArray()){
            word.append(c);
            backTracing(digits.substring(1));
            word.deleteCharAt(word.length()-1);
        }

        return;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "23"\n
// @lcpr case=end

// @lcpr case=start
// ""\n
// @lcpr case=end

// @lcpr case=start
// "2"\n
// @lcpr case=end

 */

