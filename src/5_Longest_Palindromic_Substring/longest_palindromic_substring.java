class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.equals("")) return "";
        int currL = 0, maxL = 0; 
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            currL = Math.max(expandMid(s, i, i), expandMid(s, i, i+1));
            if (currL > maxL) {
                start = i - (currL - 1) / 2;
                end = i + currL / 2;
                maxL = currL;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandMid(String s, int l, int r) {
        while(l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                l --;
                r ++;
            }
            else break;
        }
        return r - l - 1;
    }
}