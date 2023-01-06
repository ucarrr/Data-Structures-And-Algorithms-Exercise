package algorithm.dynamicprogramming;

import java.util.Arrays;

public class Knapsack {

    //Fractional Knapsack Problem using Greedy algorithm
    //we can break items for maximizing the total value of the knapsack

    public static void main(String[] args) {

        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int[] profits = {10, 5, 15, 7, 6, 18, 3};
        int capacity = 15;


        double maxValue = getMaxProfit(weights, profits, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);


        System.out.println(maxValue);
    }

    private record KnapsackSolution(double[] items, double maxProfit) {
        public static void print(KnapsackSolution knapsackSolution) {
            System.out.println("*******    Maximum profit of knapsack  =  " + knapsackSolution.maxProfit + "    *******");
            System.out.println("*******    Items in knapsack are     *******");
            printArray(knapsackSolution.items);
        }
    }

    private static double getMaxProfit(int[] weights, int[] profits, int capacity) {
        int maxProfit = 0;

        int[] avgProfits = new int[profits.length];

        for (int i = 0; i < profits.length; i++)
            avgProfits[i] = profits[i] / weights[i];

        int[] sortedAvgProfit = avgProfits.clone();

        Arrays.sort(sortedAvgProfit);

        for (int i = sortedAvgProfit.length - 1; i >= 0; i--) {

            int index = findIndex(avgProfits, sortedAvgProfit[i]);

            if (weights[index] <= capacity) {
                maxProfit += profits[index];
                capacity -= weights[index];
            } else {
                maxProfit += (capacity * sortedAvgProfit[i]);
                break;
            }

        }

        return maxProfit;
    }

    private static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value)
                return i;

        return -1;

    }

    public static void printArray(double[] array) {

        for (double element : array)
            System.out.print(round(element, 2) + " ");

        System.out.println();

    }

    private static double round(double num, int digits) {

        double n = Double.longBitsToDouble(Double.doubleToLongBits(num) + 1);
        double p = Math.pow(10, digits);

        return Math.round(n * p) / p;

    }
}
