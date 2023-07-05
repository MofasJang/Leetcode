/*
 * @lc app=leetcode.cn id=37 lang=java
 * @lcpr version=21909
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        backTracing(board);
        return;
    }
    public boolean backTracing(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.') continue;
                for(char c = '1'; c <= '9'; c++){
                    if(isValid(board,i,j,c)){
                        board[i][j] = c;
                        if(backTracing(board)) return true;
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int vol, char c){
        for(int i = 0; i < 9; i++)
            if(board[i][vol] == c) return false;
        for(int j = 0; j < 9; j++)
            if(board[row][j] == c) return false;
        for(int i = row / 3 * 3; i < row / 3 * 3 + 3; i++)
            for(int j = vol / 3 * 3; j < vol / 3 * 3 + 3; j++)
                if(board[i][j] == c) return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]\n
// @lcpr case=end

 */

