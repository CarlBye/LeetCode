class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        int ans = 0;
        Boolean isNeg = false;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) isNeg = true;
        long x = Math.abs((long)dividend);
        long y = Math.abs((long)divisor);
        for (int i = 31; i >= 0; i--) {
            if ((x>>i >= y)) {
                ans += 1<<i;
                x -= y<<i;
            }
        }
        return isNeg == true ? -1*ans : ans;
    }
}