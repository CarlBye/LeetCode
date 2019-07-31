class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        List<List<Integer>> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (List<Integer> list: ans) {
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(nums[i]);
                tmp.add(tmpList);
            }
            ans.addAll(tmp);
            tmp.clear();
        }
        return ans;
    }
}
