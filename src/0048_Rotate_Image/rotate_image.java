class Solution {
    public void rotate(int[][] matrix) {
        int abs1 = 0;
        int abs2 = matrix.length - 1;
        int tmp, p1, p2;
        while (abs1 < abs2) {
            p1 = abs1;
            p2 = abs2;
            while (p1 != abs2) {
                tmp = matrix[abs1][p1];
                matrix[abs1][p1] = matrix[p2][abs1];
                matrix[p2][abs1] = matrix[abs2][p2];
                matrix[abs2][p2] = matrix[p1][abs2];
                matrix[p1][abs2] = tmp;
                p1++;
                p2--;
            }
            abs1++;
            abs2--;
        }
    }
}