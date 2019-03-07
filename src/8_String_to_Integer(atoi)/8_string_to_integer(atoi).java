class Solution {
    public int myAtoi(String str) {
        int len = str.length();
        char ch;
        Boolean isFirst = true;
        Boolean isNeg = false;
        int curr = 0, ans = 0;
        for(int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if(isFirst == true) {
                if (ch == ' ') continue;
                else if((ch < '0' || ch > '9') && ch != '-' && ch != '+') {
                    return 0;
                } else {
                    isFirst = false;
                    if (ch == '-') isNeg = true;
                    else if (ch >= '0' && ch <= '9')  ans = ch - '0';
                }
            } else {
                if(ch < '0' || ch > '9') {
                    break;
                } else {
                    curr = ans;
                    ans = ans * 10 + (ch - '0');
                    if (curr != ans / 10) return isNeg == true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
        }
        ans = isNeg == true ? -1 * ans : ans;
        return ans;
    }
}