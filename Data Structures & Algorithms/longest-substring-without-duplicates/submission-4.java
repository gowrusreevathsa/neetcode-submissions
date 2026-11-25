class Solution {

    /**
    zxyxyz
    
    iterate i;
    check if i-th char is in set
    if not -> add i-th char to set
    if yes -> len of substring --> i - startOfSubstring

    startOfNewSubstring -> 

    */

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();
        int maxLen = 1;
        int l = 0, r = 1; 
        set.add(s.charAt(0));

        for(r = 1; r < s.length(); ++r) {
            char c = s.charAt(r);
            if(set.contains(c)) {
                maxLen = Math.max(maxLen, r - l);
                char lc = s.charAt(l);
                while(lc != c) {
                    set.remove(lc);
                    ++l;
                    lc = s.charAt(l);
                }
                ++l;
            }
            set.add(c);
        }
        return Math.max(maxLen, r - l);
    }
}
