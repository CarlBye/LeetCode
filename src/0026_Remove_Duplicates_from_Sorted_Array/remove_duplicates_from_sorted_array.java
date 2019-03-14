class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 1) return 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}