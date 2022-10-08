package Strategy.rainwatertrapping;

public class OptimalN1Strategy implements RainWaterTrappingSolutionStrategy {

    @Override
    public int calculateTotalTrappedRainWater(int[] heights) {
        int maxIdx = 0;
        for(int i=1;i<heights.length;++i) {
            if(heights[i] > heights[maxIdx]) {
                maxIdx = i;
            }
        }
        int totalWaterTrapped = 0, leftMax = heights[0];
        for(int i=1;i<maxIdx;++i) {
            leftMax = Math.max(heights[i], leftMax);
            int minAdjHeight = Math.min(leftMax, heights[maxIdx]);
            if(minAdjHeight > heights[i]) {
                totalWaterTrapped += minAdjHeight - heights[i];
            }
        }
        int rightMax = heights[heights.length-1];
        for(int i=heights.length-2; i>maxIdx; --i) {
            rightMax = Math.max(rightMax, heights[i]);
            int minAdjHeight = Math.min(rightMax, heights[maxIdx]);
            if(minAdjHeight > heights[i]) {
                totalWaterTrapped += minAdjHeight - heights[i];
            }
        }
        return totalWaterTrapped;

    }
}
