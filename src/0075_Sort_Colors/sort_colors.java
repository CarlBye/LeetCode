class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        int cur = 0;
        while (cur <= r) {
            if (nums[cur] == 0) {
                swap(nums, l, cur);
                l++;
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, r, cur);
                r--;
            } else cur++;
        }
    }
    private void swap(int[] nums, int p, int q) {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }
}
