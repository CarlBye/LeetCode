class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(char c : s.trim().toCharArray()) {
            if (c == ' ') {
                len = 0;
            } else {
                len++;
            }
        }
        return len;
    }
}