class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> h = new HashMap<>();

        for(String s: strs){
            int[] freq = new int[26];
            for(char c: s.toCharArray()){
                ++freq[c - 'a'];
            }


            String key = Arrays.toString(freq);
            h.putIfAbsent(key, new ArrayList<>());
            h.get(key).add(s);
        }
        
        return new ArrayList<>(h.values());
    }
}
