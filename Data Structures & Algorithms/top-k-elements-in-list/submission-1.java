class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> freq = new ArrayList<>();
        for(int i = 0; i <= nums.length; ++i) {
            freq.add(new ArrayList<>());
        }

        Map<Integer, Integer> count = new HashMap<>();
        for(int i : nums) {
            if(count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            }
            else {
                count.put(i, 1);
            }
        }

        count.forEach((key, value) -> {
            freq.get(value).add(key);
        });

        // System.out.println(count);
        // System.out.println(freq);

        List<Integer> res = new ArrayList<>();

        for(int i = nums.length; i >= 0; --i) {
            if(freq.get(i).size() > 0) {
                res.addAll(freq.get(i));
                k -= freq.get(i).size();
                if(k == 0) break;
            }
        }

        // freq.forEach(list -> {
        //     if(list.size() > 0) {
        //         res.addAll(list);
        //     }
        // });

        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
