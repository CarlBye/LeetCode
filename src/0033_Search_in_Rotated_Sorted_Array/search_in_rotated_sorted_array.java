class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return -1;
        int left = 0, right = len - 1, mid;
        while(left < right) {
            mid = (left + right) / 2;
            if(nums[left] >= nums[mid]) {
                right = mid;
            } else if(nums[right] < nums[mid]) {
                left = mid;
            } else {
                break;
            }
        }
        int rotate = left;
        left = 0;
        right = rotate;
        while(left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }            
        }
        left = rotate + 1;
        right = len - 1;
        while(left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }            
        }
        return -1;
    }
}