class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int iMax = 1, iMin = 1;
        for (int i : nums) {
            if (i < 0) {
                int tmp = iMax;
                iMax = iMin;
                iMin = tmp;
            }
            iMax = Math.max(iMax * i, i);
            iMin = Math.min(iMin * i, i);
            max = Math.max(iMax, max);
        }
        return max;
    }
}
