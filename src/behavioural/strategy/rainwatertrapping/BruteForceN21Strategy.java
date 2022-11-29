package behavioural.strategy.rainwatertrapping;

public class BruteForceN21Strategy implements RainWaterTrappingSolutionStrategy {
    @Override
    public int calculateTotalTrappedRainWater(int[] heights) {
        int totalWaterTrapped = 0, leftMax = heights[0], rightMax = 0;
        for(int i=1;i<heights.length-1;++i) {
            leftMax = Math.max(leftMax, heights[i]);
            rightMax = 0;
            for(int j=i+1;j<heights.length;++j) {
                rightMax = Math.max(rightMax, heights[j]);
            }
            int minBoundary = Math.min(leftMax, rightMax);
            if(minBoundary > heights[i]) {
                totalWaterTrapped += minBoundary - heights[i];
            }
        }
        return totalWaterTrapped;
    }
}
