class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] ar1 = new int[26];
        int[] ar2 = new int[26];

        for(int i = 0; i<s.length(); ++i){
            ++ar1[s.charAt(i) - 'a'];
            ++ar2[t.charAt(i) - 'a'];
        }

        // for(int i = 0; i<t.length(); ++i){
        //     ++ar2[t.charAt(i) - 'a'];
        // }

        for(int i = 0; i<26; ++i){
            if(ar1[i] != ar2[i]){
                return false;
            }
        }

        return true;
    }
}
