class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        char ch;
        if (strs[0].isEmpty()) return "";
        else char ch = strs[0].charAt(0);
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty() || strs[i].charAt(0) != ch) {
                return "";
            }
            strs[i] = strs[i].length() <= 1 ? "" : strs[i].substring(1);
        }
        return ch + longestCommonPrefix(strs);
    }
}