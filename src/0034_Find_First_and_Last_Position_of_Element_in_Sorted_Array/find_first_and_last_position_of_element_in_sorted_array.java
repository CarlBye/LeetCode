class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] ans = {-1, -1};
        int left = 0, right = len - 1, mid;      
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left < len && nums[left] == target) ans[0] = left;        
        left = 0;
        right = len - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && nums[right] == target) ans[1] = right;
        return ans;
    }
}