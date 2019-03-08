class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'M' : 
                    num += 1000; break;
                case 'D' :
                    num += 500; break;
                case 'C' :
                    if (i < len - 1 && s.charAt(i+1) == 'M') {
                        num += 900; i++;
                    } else if (i < len - 1 && s.charAt(i+1) == 'D') {
                        num += 400; i++;
                    } else num += 100;
                    break;
                case 'L' :
                    num += 50; break;
                case 'X' :
                    if (i < len - 1 && s.charAt(i+1) == 'C') {
                        num += 90; i++;
                    } else if (i < len - 1 && s.charAt(i+1) == 'L') {
                        num += 40; i++;
                    } else num += 10;
                    break;
                case 'V' :
                    num += 5; break;
                case 'I' :
                    if (i < len - 1 && s.charAt(i+1) == 'X') {
                        num += 9; i++;
                    } else if (i < len - 1 && s.charAt(i+1) == 'V') {
                        num += 4; i++;
                    } else num += 1;
                    break;
            }
        }
        return num;
    }
}