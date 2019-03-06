class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        int mid = nums.length / 2; 
        int remainder = nums.length % 2;
        double ans = (remainder == 0) ? (nums[mid - 1] + nums[mid]) / 2.0 : nums[mid] / 1.0;
        return ans;
    }
}