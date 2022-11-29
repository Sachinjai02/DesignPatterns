package behavioural.strategy.rainwatertrapping;

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

            if(leftMax > heights[i]) {
                totalWaterTrapped += leftMax - heights[i];
            }
        }
        int rightMax = heights[heights.length-1];
        for(int i=heights.length-2; i>maxIdx; --i) {
            rightMax = Math.max(rightMax, heights[i]);
            if(rightMax > heights[i]) {
                totalWaterTrapped += rightMax - heights[i];
            }
        }
        return totalWaterTrapped;

    }
}
