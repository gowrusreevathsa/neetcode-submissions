class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0, j = heights.length - 1;
        while(i < j) {
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);
            int a = w * h;
            max = Math.max(a, max);
            if(heights[i] < heights[j]) {
                ++i;
            }
            else {
                --j;
            }
        }
        return max;
    }
}
