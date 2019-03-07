class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int len = s.length();
        int pos;
        ArrayList<StringBuilder> ans = new ArrayList<>();
        for (int i = 0; i < Math.min(len, numRows); i++) {
            ans.add(new StringBuilder());
        }
        for (int i = 0; i < len; i++) {
            int c = 2 * numRows - 2;
            pos = i % (c);
            ans.get((pos < numRows) ? pos : c - pos).append(s.charAt(i));
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : ans) ret.append(row);
        return ret.toString();
    }
}