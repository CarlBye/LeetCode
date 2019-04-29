class Solution {
    public String getPermutation(int n, int k) {
        if (n == 1) return String.valueOf(1);
        int tmp, ans = 0;
        int[] cnt = new int[n-1];
        List<Integer> num = new ArrayList<>();
        cnt[0] = 1;
        for(int i = 1; i < n-1; i++) {
            cnt[i] = cnt[i-1]*(i+1);
        }
        for (int i = 0; i < n; i++) {
            num.add(Integer.valueOf(i+1));
        }
        k--;
        for(int i = n-2; i >= 0; i--) {
            tmp = num.get(k / cnt[i]);
            ans = ans * 10 + tmp;
            num.remove(Integer.valueOf(tmp));
            k = k % cnt[i];
        }
        ans = ans * 10 + num.get(0);
        return String.valueOf(ans);
    }
}