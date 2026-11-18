class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] comp = new int[nums.length]; 

        // for(int i = 0; i<nums.length; ++i){
        //     comp[i] = target - nums[i];
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; ++i){
            int num = nums[i];
            int comp = target - num;

            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }

            map.put(num, i);
        }

        return new int[]{};
    }
}
