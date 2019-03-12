class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len == 0) return true;
        if (len % 2 == 1) return false;
        char[] stack = new char[len / 2];
        int curr = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                if (curr < len / 2) {
                    stack[curr++] = s.charAt(i);
                } else return false;               
            }
            else if (curr > 0 && (s.charAt(i) == ')' && stack[curr-1] == '(' || s.charAt(i) == ']' && stack[curr-1] == '[' || s.charAt(i) == '}' & stack[curr-1] == '{')) {
                curr --;
            } else return false;
        }
        if (curr == 0) return true;
        else return false;
    }
}