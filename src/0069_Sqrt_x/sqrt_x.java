class Solution {
    public int mySqrt(int x) {
        long left = 0, right = x / 2 + 1, mid = 0;
        while (left < right) {
            mid = (left + right + 1) >>> 1;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int)left;
    }
}
