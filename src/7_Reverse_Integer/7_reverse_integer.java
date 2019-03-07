class Solution {
    public int reverse(int x) {
        int n = 0, tmp = 0, ans = 0;
        while (x != 0) {
            n = x % 10;
            x = x / 10;
            tmp = ans;
            ans = ans * 10 + n;
            if (ans / 10 != tmp) {
                return 0;
            }
        }
        return ans;
    }
}