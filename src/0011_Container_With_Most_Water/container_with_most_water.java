class Solution {
    public int maxArea(int[] height) {
        int curr = 0, max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[j] > height[i]) i++;
            else j--;
        }
        return max;
    }
}