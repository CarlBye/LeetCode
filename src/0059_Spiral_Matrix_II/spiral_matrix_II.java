class Solution {
    public int[][] generateMatrix(int n) {
        int times = (n + 1) / 2;
        int[][] ret = new int[n][n];
        int maxL, num = 1;
        for(int ri = 0; ri < times; ri++) {
            maxL = n - ri;
            for(int i = ri; i < maxL; i++) {
                ret[ri][i] = num++;
            }
            for(int i = ri+1; i < maxL; i++) {
                ret[i][maxL-1] = num++;
            }
            for(int i = maxL-2; i >= ri; i--) {
                ret[maxL-1][i] = num++;
            }
            for(int i = maxL-2; i>ri; i--) {
                ret[i][ri] = num++;
            }
        }
        return ret;
    }
}