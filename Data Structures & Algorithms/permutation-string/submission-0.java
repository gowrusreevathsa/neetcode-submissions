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

        if(similarArray(freq, temp)) {
            return true;
        }

        for(int i = s1.length(); i < s2.length(); ++i) {
            ++temp[s2.charAt(i) - 'a'];
            --temp[s2.charAt(i - s1Len) - 'a'];

            if(similarArray(freq, temp)) {
                return true;
            }
        }

        return false;
    }

    private boolean similarArray(int[] a, int [] b) {
        for(int i = 0; i < 26; ++i) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
