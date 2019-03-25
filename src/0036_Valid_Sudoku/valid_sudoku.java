class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }
        int num, index;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' ) {
                    num = board[i][j] - '0';
                    index = (i / 3) * 3 + j / 3;
                    if (rows[i].containsKey(num) || cols[j].containsKey(num) || boxes[index].containsKey(num)) return false;
                    rows[i].put(num, 1);
                    cols[j].put(num, 1);
                    boxes[index].put(num, 1);                    
                }
            }
        }
        return true;
    }
}