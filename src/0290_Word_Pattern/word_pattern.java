class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        char[] c = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();
        if(s.length != c.length) return false;
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i]) && !map.get(c[i]).equals(s[i])) return false;
            if (!map.containsKey(c[i])) {
                if (map.containsValue(s[i])) return false;
                else map.put(c[i], s[i]);
            }
        }
        return true;
    }
}
