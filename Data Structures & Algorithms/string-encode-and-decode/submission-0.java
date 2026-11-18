class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder("");

        strs.forEach(str -> {
            s.append(str.length())
            .append("#")
            .append(str);
        });
        // System.out.println(s.toString());
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i < str.length();) {

            //get length
            int j;
            int len = 0;
            for(j = i; j < str.length(); ++j) {
                char c = str.charAt(j);
                if(c == '#'){
                    // System.out.println(j + "---" + len);
                    res.add(str.substring(j+1, j + len + 1));
                    break;
                }
                if(c >= '0' && c <= '9') {
                    len = (len*10) + (c - '0');
                }
            }

            i = j + len + 1;
        }

        return res;
    }
}
