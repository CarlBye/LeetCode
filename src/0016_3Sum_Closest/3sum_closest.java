class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2], sum = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1, k = len - 1; j < k;) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;            
                }
                if (sum > target) k--;
                else if (sum < target) j++;
                else return target;
            }
        }
        return min;
    }
}