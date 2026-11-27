class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];
        int[] temp = new int[26];
        int s1Len = s1.length();
        for(int i = 0; i < s1Len; ++i) {
            ++freq[s1.charAt(i) - 'a'];
            ++temp[s2.charAt(i) - 'a'];
        }

        int matches = 0;
        for(int i = 0; i < 26; ++i) {
            if(freq[i] == temp[i]) {
                ++matches;
            }
        }

        for(int i = s1.length(); i < s2.length(); ++i) {

            if(matches == 26) {
                return true;
            }

            int idx = s2.charAt(i) - 'a';
            ++temp[idx];
            if(freq[idx] == temp[idx]) {
                ++matches;
            }
            else if(freq[idx] + 1 == temp[idx]) {
                --matches;
            }

            idx = s2.charAt(i - s1Len) - 'a';
            --temp[idx];
            if(freq[idx] == temp[idx]) {
                ++matches;
            }
            else if(freq[idx] - 1 == temp[idx]) {
                --matches;
            }
        }

        return matches == 26;
    }
}
