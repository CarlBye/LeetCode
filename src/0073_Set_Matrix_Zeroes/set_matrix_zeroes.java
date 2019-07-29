class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!rows.contains(i)) rows.add(i);
                    if (!cols.contains(j)) cols.add(j);
                }
            }
        }
        for (Integer ii : rows) {
            int i = ii.intValue();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (Integer jj : cols) {
            int j = jj.intValue();
            for (int i = 0; i < m; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
