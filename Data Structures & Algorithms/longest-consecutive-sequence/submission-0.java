class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }

        int longest = 0;
        
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int len = 1;
                while(set.contains(num + len)) {
                    ++len;
                }
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
