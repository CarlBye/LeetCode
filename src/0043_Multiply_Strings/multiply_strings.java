class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (num1.charAt(0) == '0' || num2.charAt(0) == '0') return "0";
        int a, b, c = 0;
        char d;
        int[] v = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                a = num1.charAt(i) - '0';
                b = num2.charAt(j) - '0';
                v[i+j+1] += a * b;
            }
        }
        for (int i = len1 + len2 - 1; i >= 0; i--) {
            v[i] += c;
            c = v[i] / 10;
            v[i] %= 10;
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (v[i] == 0) {
            i++;
        }
        for(int j = i; j < len1 + len2; j++) {
            ans.append((char)(v[j] + '0'));
        }
        return ans.toString();
    }
}