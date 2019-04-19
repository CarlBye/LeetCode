class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0) return ans;
        int cols = matrix[0].length;
        int times = (Math.min(rows, cols) + 1) / 2;
        int maxRow, maxCol, i = 0, j;
        for (int ri = 0; ri < times; ri++) {
            maxRow = rows - ri;
            maxCol = cols - ri;
            for (j = ri; i < maxRow && j < maxCol; j++) {
                ans.add(matrix[i][j]);
            }
            j--;
            for (i = ri + 1; i < maxRow && j < maxCol; i++) {
                ans.add(matrix[i][j]);
            }
            i--;
            for (j--; i > ri && j >= ri; j--) {
                ans.add(matrix[i][j]);
            }
            j++;
            for (i--; i > ri && j < maxCol - 1; i--) {
                ans.add(matrix[i][j]);
            }
            i++;
        }
        return ans;
    }
}