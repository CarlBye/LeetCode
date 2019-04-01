class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> t = new ArrayList<>();
        int len = nums.length;
        if (len == 1) {
            ans.add(new ArrayList<Integer>(){{
                add(nums[0]);
            }});
            return ans;
        }
        for (int i = 0; i < len; i++){
            t = permute(getNewArray(nums, i));
            for(List<Integer> list : t) {
                list.add(0, nums[i]);
                ans.add(list);
            }
        }
        return ans;
    }
    public int[] getNewArray(int[] nums, int i) {
        int[] res = Arrays.copyOfRange(nums, 1, nums.length);
        if(i > 0) res[i-1] = nums[0];
        return res;
    }
}