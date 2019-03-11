class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len - 3; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                for (int j = i + 1; j < len - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j-1]) {
                        for (int k = j + 1, m = len - 1; k < m; ) {
                            sum = nums[i] + nums[j] + nums[k] + nums[m];                    
                            if (sum < target) {
                                k++;
                            } else if (sum > target) {
                                m--;
                            } else {
                                ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
                                while (k < m && nums[k] == nums[k+1]) k++;
                                while (k < m && nums[m] == nums[m-1]) m--;
                                k++;
                                m--;
                            }
                        }
                    }
                }
            }            
        }
        return ans;
    }
}