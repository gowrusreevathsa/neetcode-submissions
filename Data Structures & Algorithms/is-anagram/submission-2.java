class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        if(s.length() == 0) {
            return true;
        }

        char[] cArr = new char[26];

        for(int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            ++cArr[c1 - 'a'];
            --cArr[c2 - 'a'];
        }

        for(int i = 0; i < 26; ++i) {
            if(cArr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
