package algorithm.heap;

public class HeapSort {

    // https://www.geeksforgeeks.org/heap-sort/ --> implementation

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        // heapify(arr, arr.length, 0);
        sort(arr);
        printArray(arr);
        heapInsert(arr, 18, n);
        printArray(arr);

    }


    public static void sort(int[] arr) {
        int n = arr.length;

        //rearrange array
        // parent = i / 2 - 1
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {

            swap(arr, 0, i);

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

    }

    //n = array length
    public static void heapify(int[] arr, int n, int i) {
        int root = i; // root
        int leftChild = i * 2 + 1; // left child of the root
        int rightChild = i * 2 + 2; //right child of the root

        // If left child is larger than root
        if (leftChild < n && arr[leftChild] > arr[root]) {
            root = leftChild; //index value of array
        }

        if (rightChild < n && arr[rightChild] > arr[root]) {
            root = rightChild; // index value of array
        }

        //If the array index values are not the same,
        // one of its children is greater than the root.
        // then swap
        if (root != i) {
            swap(arr, i, root);
            heapify(arr, n, root);

        }


    }

    public static void heapInsert(int[] arr, int key, int n) {
        //n = n + 1;
        int i = n;
        while (i > 0 && arr[i / 2] < key) {
            arr[i] = arr[i / 2];
            i = i / 2;

        }
        arr[i] = key;

    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }


}
