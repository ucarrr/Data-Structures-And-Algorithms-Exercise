package algorithm.homework2;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class MUHAMMET_UCAR_Q2 {

    public static void main(String[] args) {

        int[] WN = {3, 4, 2, 6, 1, 9, 8, 8, 5};
        int[][] WE = {
                {0, 1, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 6, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 9, 3, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 6, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        System.out.println("Example input to demonstrate the greedy algorithm doesn't work every time");
        for (int i = 0; i < WN.length; i++) {
            System.out.print(WN[i] + "-");
        }
        System.out.println("\nEdges");
        for (int i = 0; i < WE.length; i++) {
            for (int j = 0; j < WE.length; j++) {
                System.out.print(WE[i][j] + "-");
            }
            System.out.println();
        }

        //I am using dynamic algorithm to get index.
        int[] abc = dynamicProgramming(WN, WE);
        System.out.println("Greedy Algorithm || index: " + greedy(WN, WE, WN.length, 0));
        System.out.println("Recursive algorithm || index: " + abc[1] + " value: " + findsmallest(WN, WE, WN.length, 0));
        System.out.println("Dynamic algorithm ||  index: " + abc[1] + " value: " + abc[0]);


        //1. Run
        System.out.println("************ 1. Run  **************");
        int[] array = createRandomArr(1000);
        int[][] edges = createEdge(array);

        Instant start1_1 = Instant.now();
        int greedyResult = greedy(array, edges, array.length, 0);
        Instant end1_1 = Instant.now();
        Duration timeElapsed1_1 = Duration.between(start1_1, end1_1);
        System.out.println("Elapsed Time for Greedy algorithm: " + timeElapsed1_1.toNanos());


        Instant start1_2 = Instant.now();
        int[] result = dynamicProgramming(array, edges);
        Instant end1_2 = Instant.now();
        Duration timeElapsed1_2 = Duration.between(start1_2, end1_2);
        System.out.println("Elapsed Time for dynamic algorithm: " + timeElapsed1_2);
        Instant start1_3 = Instant.now();
        int recursiveResult = findsmallest(array, edges, array.length, 0);
        Instant end1_3 = Instant.now();
        Duration timeElapsed1_3 = Duration.between(start1_3, end1_3);
        System.out.println("Time Elapsed for Recursive Algorithm: " + timeElapsed1_3.toNanos());


        System.out.println();
        System.out.println("Greedy Algorithm || index: " + greedyResult);
        System.out.println("Recursive algorithm || index: " + result[1] + " value: " + recursiveResult);
        System.out.println("Dynamic algorithm || index: " + result[1] + " value: " + result[0]);

        //2. Run

        System.out.println("********* 2. Run  ***************");
        array = createRandomArr(1000);
        edges = createEdge(array);

        Instant start2_1 = Instant.now();
        greedyResult = greedy(array, edges, array.length, 0);
        Instant end2_1 = Instant.now();
        Duration timeElapsed2_1 = Duration.between(start2_1, end2_1);
        System.out.println("Elapsed Time for Greedy algorithm: " + timeElapsed2_1.toNanos());


        Instant start2_2 = Instant.now();
        result = dynamicProgramming(array, edges);
        Instant end2_2 = Instant.now();
        Duration timeElapsed2_2 = Duration.between(start2_2, end2_2);
        System.out.println("Elapsed Time for Dynamic Algorithm: " + timeElapsed2_2.toNanos());

        Instant start2_3 = Instant.now();
        recursiveResult = findsmallest(array, edges, array.length, 0);
        Instant end2_3 = Instant.now();
        Duration timeElapsed2_3 = Duration.between(start2_3, end2_3);
        System.out.println("Time Elapsed for Recursive Algorithm: " + timeElapsed2_3.toNanos());


        System.out.println();
        System.out.println("Greedy Algorithm || index: " + greedyResult);
        System.out.println("Recursive algorithm || index: " + result[1] + " value: " + recursiveResult);
        System.out.println("Dynamic algorithm ||  index: " + result[1] + " value: " + result[0]);

        //3. Run
        System.out.println("************ 3. Run  **********");

        array = createRandomArr(1000);
        edges = createEdge(array);

        Instant start1_5 = Instant.now();
        int recursiveResult5 = findsmallest(array, edges, array.length, 0);
        Instant end1_5 = Instant.now();
        Duration timeElapsed1_5 = Duration.between(start1_5, end1_5);
        System.out.println("Time Elapsed for Recursive Algorithm: " + timeElapsed1_5.toNanos() +
                " " + recursiveResult5);


        System.out.println();
        System.out.println("Greedy Algorithm || index: " + greedyResult);
        System.out.println("Recursive algorithm || index: " + result[1] + " value: " + recursiveResult);
        System.out.println("Dynamic algorithm ||  index: " + result[1] + " value: " + result[0]);

        //2. Run

        System.out.println("********* 2. Run  *********");
        array = createRandomArr(1000);
        edges = createEdge(array);

        Instant start2_6 = Instant.now();
        greedyResult = greedy(array, edges, array.length, 0);
        Instant end2_6 = Instant.now();
        Duration timeElapsed2_6 = Duration.between(start2_6, end2_6);
        System.out.println("Elapsed Time for Greedy algorithm: " + timeElapsed2_6.toNanos());


        Instant start2_7 = Instant.now();
        result = dynamicProgramming(array, edges);
        Instant end2_7 = Instant.now();
        Duration timeElapsed2_7 = Duration.between(start2_7, end2_7);
        System.out.println("Elapsed Time for dynamic algorithm: " + timeElapsed2_7.toNanos());

        Instant start2_8 = Instant.now();
        recursiveResult = findsmallest(array, edges, array.length, 0);
        Instant end2_8 = Instant.now();
        Duration timeElapsed2_8 = Duration.between(start2_8, end2_8);
        System.out.println("Elapsed Time for dynamic algorithm:: " + timeElapsed2_8.toNanos());


        System.out.println();
        System.out.println("Greedy Algorithm || index: " + greedyResult);
        System.out.println("Recursive algorithm || index: " + result[1] + " value: " + recursiveResult);
        System.out.println("Dynamic algorithm ||  index: " + result[1] + " value: " + result[0]);

        //3. Run
        System.out.println("********** 3. Run **********");
        array = createRandomArr(1000);
        edges = createEdge(array);

        //3. Run
        System.out.println("********* 3. Run  *************");
        array = createRandomArr(1000);
        edges = createEdge(array);

        Instant start3_1 = Instant.now();
        greedyResult = greedy(array, edges, array.length, 0);
        Instant end3_1 = Instant.now();
        Duration timeElapsed3_1 = Duration.between(start3_1, end3_1);
        System.out.println("Time Taken for Greedy algorithm: " + timeElapsed3_1.toNanos());


        Instant start3_2 = Instant.now();
        result = dynamicProgramming(array, edges);
        Instant end3_2 = Instant.now();
        Duration timeElapsed3_2 = Duration.between(start3_2, end3_2);
        System.out.println("Time Taken for Dynamic algorithm: " + timeElapsed3_2.toNanos());

        Instant start3_3 = Instant.now();
        recursiveResult = findsmallest(array, edges, array.length, 0);
        Instant end3_3 = Instant.now();
        Duration timeElapsed3_3 = Duration.between(start3_3, end3_3);
        System.out.println("Time Taken for Recursive algorithm: " + timeElapsed3_3.toNanos());


        System.out.println();
        System.out.println("Greedy Algorithm || index: " + greedyResult);
        System.out.println("Recursive algorithm || index: " + result[1] + " value: " + recursiveResult);
        System.out.println("Dynamic algorithm ||  index: " + result[1] + " value: " + result[0]);
    }

    public static int[] createRandomArr(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(21);
        }
        return arr;
    }

    public static int[][] createEdge(int[] arr) {
        int[][] edges = new int[arr.length][arr.length];
        Random random = new Random();
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if ( i + 1 == j) {
                    edges[i][j] = random.nextInt(21);
                }
            }
        }
        return edges;
    }


    public static int greedy(int[] array, int[][] edges, int length, int index) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (edges[index][i] != 0) {
                if (array[i] < min) {
                    min = array[i];
                    result = i;
                }
            }
        }
        return result;
    }

    public static int[] dynamicProgramming(int[] arr, int[][] edges) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int totalWeight = arr[i] + edges[(i - 1) / 2][i] + arr[(i - 1) / 2];
            if (totalWeight < min) {
                min = totalWeight;
                minIndex = i;
            }
        }

        return new int[]{min, minIndex};
    }


    public static int counter = 0;

    public static int findsmallest(int[] array, int[][] edges, int length, int index) {
        counter++;
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (edges[index][i] != 0) {
                int temp = findsmallest(array, edges, length, i);
                if (temp < min) {
                    min = temp;
                    result = i;
                }
            }
        }
        return min + array[index];
    }



}


