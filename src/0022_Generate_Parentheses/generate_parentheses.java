class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(ans, "", 0, 0, n);
        return ans;
    }
    
    private void func(List<String> ans, String curr, int left,int right, int max) {
        if (curr.length() == max * 2) {
            ans.add(curr);
            return;
        }
        if (left < max) func(ans, curr+'(', left+1, right, max);
        if (right < left) func(ans, curr+')', left, right+1, max);
    }
}