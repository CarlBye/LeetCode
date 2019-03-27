class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        StringBuilder ans = new StringBuilder();
        String ss = countAndSay(n-1);
        int ssLen = ss.length();
        int count;
        for (int i = 0; i < ssLen; i++) {
            count = 1;
            while (i < ssLen - 1 && ss.charAt(i) == ss.charAt(i+1)) {
                i++; count++;
            }
            ans.append(String.valueOf(count));
            ans.append(ss.charAt(i));
        }
        return ans.toString();
    } 
}