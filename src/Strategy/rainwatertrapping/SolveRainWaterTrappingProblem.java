package Strategy.rainwatertrapping;

public class SolveRainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] buildingsHeights = new int[]{0, 1,0,2,1,0,1,3,2,1,2,1};
        RainWaterTrappingSolutionStrategy solutionStrategy = new BruteForceN21Strategy();
        //Strategy1
        System.out.println("Brute force algo .. ");
        System.out.println(solutionStrategy.calculateTotalTrappedRainWater(buildingsHeights));

        solutionStrategy = new PreCalculationsNNStrategy();
        System.out.println("Better algo by Pre calculating suffix max .. ");
        System.out.println(solutionStrategy.calculateTotalTrappedRainWater(buildingsHeights));

        solutionStrategy = new OptimalN1Strategy();
        System.out.println("Optimal algo using PLAIN Observation ;) .. ");
        System.out.println(solutionStrategy.calculateTotalTrappedRainWater(buildingsHeights));
    }
}
