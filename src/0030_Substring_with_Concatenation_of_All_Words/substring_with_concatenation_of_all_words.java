class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length(), num = words.length;
        if (num == 0 || n == 0) return ans;
        int len = words[0].length();
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        String word;
        for (int i = 0; i <= n - num * len; i++) {
            Map<String, Integer> used = new HashMap<>();
            int j = 0;
            for (; j < num; j++) {
                word = s.substring(i+j*len, i+len*(j+1));
                if (counts.containsKey(word)) {
                    used.put(word, used.getOrDefault(word, 0) + 1);
                    if (used.get(word) > counts.getOrDefault(word, 0)) break;
                } else  break;
            }
            if (j == num) ans.add(i);
        }
        return ans;
    }
}