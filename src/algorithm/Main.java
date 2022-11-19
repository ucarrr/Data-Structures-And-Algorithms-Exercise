package algorithm;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 4, 1, 3};
        int[] arr2 = {5, 2, 4, 1, 3};
        int arr3[] = {12, 11, 13, 5, 6, 7};
        int arr4[] = {10, 16, 8, 12, 15, 6, 3, 9, 5};

        // InsertionSort insertionSort= new InsertionSort();
        // insertionSort.sort(arr);
/*

        MergeSort merge=new MergeSort();
        merge.mergeSort(arr2);
*/


        //QuickSort.quicksort(arr3, 0, arr3.length - 1);

        QuickSortHoare.quicksort(arr4, 0, arr4.length - 1);

        printArray(arr4);


    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
