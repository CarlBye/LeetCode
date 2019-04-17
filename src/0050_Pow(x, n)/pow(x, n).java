class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        double half = myPow(x, Math.abs(n/2));
        double res = 1.0;
        if (n % 2 == 0) res = half * half;
        else res = half * half * x;
        if (n > 0) return res;
        else return 1 / res;
    }
}