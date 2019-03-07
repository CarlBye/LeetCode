class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int m = x, n = 0;
        int rev = 0;
        while (m != 0) {            
            n = m % 10;
            m /= 10;            
            rev = rev * 10 + n;
        }
        if (rev != x) return false;
        return true;
    }
}