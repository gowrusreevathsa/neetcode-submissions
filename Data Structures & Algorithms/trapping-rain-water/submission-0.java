class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int maxTillNow = height[0];
        maxLeft[0] = 0;

        for(int i = 1; i < height.length; ++i) {
            maxTillNow = Math.max(height[i], maxTillNow);
            maxLeft[i] = maxTillNow;
        }

        int maxRight = 0;
        int res = 0;
        for(int i = height.length - 2; i > 0; --i) {
            maxRight = Math.max(height[i + 1], maxRight);
            int waterHeight = Math.min(maxLeft[i], maxRight) - height[i];  
            if(waterHeight > 0) {
                res += waterHeight;
            }
        }
        return res;

    }
}
