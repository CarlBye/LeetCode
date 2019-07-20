class Solution {
    public int uniquePaths(int m, int n) {
        int num = 0;
        int dp[][] = new int[n+1][m+1];
        dp[n-1][m] = 1;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                dp[i][j] = dp[i][j+1] + dp[i+1][j];
            }
        }
        return dp[0][0];
    }
}
