class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        func(ans, list, candidates, target, 0);
        return ans;
    }
    public void func(List<List<Integer>> ans, List<Integer> tmp, int[] candidates, int target,int num) {
        if (target == 0) {
            ans.add(tmp);
            return;
        }
        if (target < candidates[num]) return;
        for (int i = num; i < candidates.length && target >= candidates[i]; i++) {
            List<Integer> list = new ArrayList<>(tmp);
            list.add(candidates[i]);
            func(ans, list, candidates, target - candidates[i], i);
        }
    }
}