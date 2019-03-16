class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len <= 1) return;
        int i = len - 1;
        for (; i > 0; i--) {
            if (nums[i - 1] < nums[i]) break;    
        }
        if (i == 0) {
            Arrays.sort(nums);
            return;
        }
        i--;
        int min = i+1;
        for (int j = len - 1; j > i; j--) {
            if (nums[j] > nums[i] && nums[j] < nums[min]) min = j;   
        }
        int tmp = nums[min];
        nums[min] = nums[i];
        nums[i] = tmp;
        Arrays.sort(nums, i+1, len);
    }
}