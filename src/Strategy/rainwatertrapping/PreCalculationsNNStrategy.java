package Strategy.rainwatertrapping;

public class PreCalculationsNNStrategy implements RainWaterTrappingSolutionStrategy {
    @Override
    public int calculateTotalTrappedRainWater(int[] heights) {
        int[] suffixMax = new int[heights.length];
        suffixMax[heights.length-1] = heights[heights.length-1];
        for(int i=heights.length-2;i>=0;--i) {
            suffixMax[i] = Math.max(heights[i], suffixMax[i+1]);
        }

        int totalWaterTrapped = 0, leftMax = 0;
        for(int i=1;i< heights.length-1;++i) {
            leftMax = Math.max(leftMax, heights[i]);
            int minMaxAdjHeight = Math.min(leftMax, suffixMax[i]);
            if(minMaxAdjHeight > heights[i]) {
                totalWaterTrapped += minMaxAdjHeight-heights[i];
            }
        }
        return totalWaterTrapped;
    }
}
