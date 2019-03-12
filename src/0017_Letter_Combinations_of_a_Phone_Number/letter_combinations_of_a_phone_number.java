class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans; 
        Map<Character, String> m = new HashMap<Character, String>(){
            {
                put('0', " ");
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        func(digits, m, ans, "", 0);
        return ans;
    }
    
    private void func(String digits, Map m, List<String> list, String tmp, int i) {
        String s = (String)m.get(digits.charAt(i));
        if (i < digits.length() - 1) {
            for (int j = 0; j < s.length(); j++) {
                func(digits, m, list, tmp + s.charAt(j), i + 1);
            }
        } else {
            for (int j = 0; j < s.length(); j++) { 
                list.add(tmp + s.charAt(j));
            }            
        }
    }
}