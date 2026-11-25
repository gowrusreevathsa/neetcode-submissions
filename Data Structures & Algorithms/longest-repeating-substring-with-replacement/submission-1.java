class Solution {

    /*
    XYYX -> XXYX -> XXXX

    AAABABB -> AAAAABB
    */

    public int characterReplacement(String s, int k) {

        if(s == null || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int[] freq = new int[26];
        int maxLen = 0;

        for(int right = 0; right < s.length(); ++right) {
            ++freq[s.charAt(right) - 'A'];

            while((right - left + 1) - maxNum(freq) > k) {
                --freq[s.charAt(left) - 'A'];
                ++left;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    private int maxNum(int[] nums) {
        int max = 0;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
}
