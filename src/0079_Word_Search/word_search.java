class Solution {
    char[][] board;
    int rows;
    int cols;
    boolean[][] flag;
    String word;
    
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) return false;

        this.board = board;
        this.rows = board.length;
        this.cols = board[0].length;
        this.word = word;
        this.flag = new boolean[rows][cols];

        char ch = word.charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (ch == board[i][j]) {
                    flag[i][j] = true;
                    if(BackTrack(i, j, 1)) return true;
                    flag[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean BackTrack(int i, int j, int index) {
        if (index >= word.length()) return true;
        char ch = word.charAt(index);
        if (i > 0 && !flag[i-1][j] && board[i-1][j] == ch) {
            flag[i-1][j] = true;
            if (BackTrack(i-1, j, index+1)) return true;
            flag[i-1][j] = false;
        }
        if (i < rows-1 && !flag[i+1][j] && board[i+1][j] == ch) {
            flag[i+1][j] = true;
            if (BackTrack(i+1, j, index+1)) return true;
            flag[i+1][j] = false;
        }
        if (j > 0 && !flag[i][j-1] && board[i][j-1] == ch) {
            flag[i][j-1] = true;
            if (BackTrack(i, j-1, index+1)) return true;
            flag[i][j-1] = false;
        }
        if (j < cols-1 && !flag[i][j+1] && board[i][j+1] == ch) {
            flag[i][j+1] = true;
            if (BackTrack(i, j+1, index+1)) return true;
            flag[i][j+1] = false;
        }
        return false;
    }
}
