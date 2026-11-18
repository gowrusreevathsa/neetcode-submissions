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

        int i = 0; 

        while(i < str.length()) {
            int del = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, del));
            int start = del + 1;
            int end = start + len;
            
            res.add(str.substring(start, end));
            i = end;
        }

        return res;
    }
}
