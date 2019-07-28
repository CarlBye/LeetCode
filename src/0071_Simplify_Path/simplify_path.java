class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] buff = path.split("/+");
        for (int i = 1; i < buff.length; i++) {
            if (buff[i].equals("..") && !st.empty()) {
                st.pop();
            } else if (!buff[i].equals(".") && !buff[i].equals("..")) {
                st.push(buff[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String curr : st) {
            sb.append("/");
            sb.append(curr);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
