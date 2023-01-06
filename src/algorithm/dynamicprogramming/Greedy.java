package algorithm.dynamicprogramming;

import java.util.Arrays;


public class Greedy {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 8, 4, 9, 10};
        greedyMethod(arr, arr.length);

        double[] weights = {2, 3, 5, 7, 1, 4, 1};
        double[] profits = {10, 5, 15, 7, 6, 18, 3};
        int capacity = 15;

        getMaxProfit(profits, weights, capacity);


    }

    public static void greedyMethod(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {

        }

    }

    public static void fractional_Knapsack(double[] profits, double[] weight, int bagSize) {
        getMaxProfit(profits, weight, bagSize);
    }

    private static void getMaxProfit(double[] profits, double[] weight, int bagSize) {


        int maxProfit = 0;
        int totalProfitValue = 0;
        int totalWeightValue = 0;
        int count = 0;

        double[] avgArr = new double[weight.length];

        for (int i = 0; i < avgArr.length; i++) {
            avgArr[i] = profits[i] / weight[i];
        }
        //printArray(profits);
        printArray(avgArr);
        double maxValue = findMaxValue(avgArr);

        double[] sortedArray = avgArr.clone();

        Arrays.sort(sortedArray);


        for (int i = sortedArray.length; i >= 0; i--) {

            double maxIndex = findMaxIndex(avgArr, sortedArray[i]);

            if (weight[(int) maxIndex] <= bagSize) {
                maxProfit = maxProfit + (int) profits[(int) maxIndex];
                bagSize = (int) (bagSize - weight[(int) maxIndex]);
                totalProfitValue = (int) profits[(int) maxIndex] * (int) weight[(int) maxIndex];
            }


        }

    }

    private static double findMaxIndex(double[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    private static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static double findMaxValue(double[] avgArr) {

        double maxValue = 0;

        maxValue = avgArr[0];

        for (int i = 1; i < avgArr.length; i++) {

            if (maxValue < avgArr[i]) {
                maxValue = avgArr[i];
            }

        }

        return maxValue;
    }

}
