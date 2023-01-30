package algorithm.dynamicprogramming;

import java.util.Arrays;


public class Knapsack {


    public static void main(String[] args) {

        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int[] profits = {10, 5, 15, 7, 6, 18, 3};
        int capacity = 15;

        int[] weights2 = {0, 1, 2, 5, 6};
        int[] profits2 = {0, 2, 3, 4, 5};
        int capacity2 = 8;

        zeroOne(weights2, profits2, capacity2, 4);

      /*  double maxValue = getMaxProfit(weights, profits, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);


        System.out.println(maxValue);*/
    }

    // 0/1 Knapsack Problem
    // We can not break items
    // Ex: laptop
    // n = item Number
    private static void zeroOne(int[] weights, int[] profits, int bagCapacity, int n) {

        int[][] k = new int[n + 1][bagCapacity + 1];


        for (int i = 0; i <= n; i++) {

            for (int w = 0; w <= bagCapacity; w++) {

                if (i == 0 || w == 0) {
                    System.out.print(k[i][w] = 0);
                    System.out.print(" ");
                } else if (weights[i] < w) {
                    System.out.print(k[i][w] = getMax(profits[i] + k[i - 1][w - weights[i]], k[i - 1][w]));
                    System.out.print(" ");
                }else{
                    System.out.print( k[i][w]=k[i-1][w]);
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }



    }

    private static int getMax(int a, int b) {

        if (a > b) return a;

        return b;
    }


    //Fractional Knapsack Problem using Greedy algorithm
    //We can break items for maximizing the total value of the knapsack
    //EX: 1KG Tomato, 1/2 KG Onion

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
