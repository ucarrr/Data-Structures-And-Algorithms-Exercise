package algorithm.MediansandOrderStatistics;

import java.util.Arrays;

public class SelectionLinearTime {
    public static void main(String[] args) {

    }


    public static int kthSmallest(Integer[] arr, int K)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return K'th element in
        // the sorted array
        return arr[K - 1];
    }

}
