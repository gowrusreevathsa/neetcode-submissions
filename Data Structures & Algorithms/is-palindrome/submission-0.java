class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] cArr = s.toCharArray();

        char lc, rc;
        while(l < r) {
            lc = cArr[l];
            rc = cArr[r];

            if(!isValidChar(lc)) {
                ++l;
                continue;
            }
            if(!isValidChar(rc)) {
                --r;
                continue;
            }
            if(Character.toLowerCase(lc) != Character.toLowerCase(rc)) {
                return false;
            }
            ++l;
            --r;
        }

        return true;
    }

    private boolean isValidChar(char c) {
        if(
            (c >= 'a' && c <= 'z') 
            || (c >= 'A' && c <= 'Z')
            || (c >= '0' && c <= '9')
        ) {
            return true;
        }
        return false;
    }
}
