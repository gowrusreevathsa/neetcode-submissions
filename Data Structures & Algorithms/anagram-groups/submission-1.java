class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String[] sortedStrs = new String[strs.length];

        for(int i = 0; i < strs.length; ++i) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            sortedStrs[i] = new String(s);
        }

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < sortedStrs.length; ++i) {
            List l = map.get(sortedStrs[i]);
            if(l == null) {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(sortedStrs[i], newList);
            }
            else {
                map.get(sortedStrs[i]).add(strs[i]);
            }
        }

        List<List<String>> res = new ArrayList<>();

        map.forEach((k, v) -> {
            res.add(v);
        });

        return res;
    }
}
