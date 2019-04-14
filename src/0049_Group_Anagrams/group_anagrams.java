class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String org = String.valueOf(cs);
            if (!map.containsKey(org)) {
                map.put(org, new ArrayList<String>());
            }           
            map.get(org).add(s);
        }
        return new ArrayList(map.values());
    }
}