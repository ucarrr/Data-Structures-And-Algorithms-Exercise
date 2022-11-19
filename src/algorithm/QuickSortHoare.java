package algorithm;


public class QuickSortHoare {

    //AbdulBari

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[left];

        int i = left;
        int j = right;

        while (i < j) {

            while (arr[i] <= pivot && left < j) {
                i++;
            }
            while (arr[j] >= pivot && left < j) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);

            }


        }
        swap(arr, left, j);

        return j;

    }

    public static void quicksort(int[] arr, int leftIndex, int rightIndex) {
        int i = leftIndex;

        if (leftIndex >= rightIndex) {
            return;
        }


        if (leftIndex < rightIndex) {
            int j = partition(arr, leftIndex, rightIndex);
            quicksort(arr, leftIndex, j);
            quicksort(arr, j + 1, rightIndex);

        }

    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
