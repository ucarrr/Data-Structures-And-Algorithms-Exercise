package algorithm.homework1;

public class Question2 {

    public static void main(String[] args) {

        int arr1[] = {10, 80, 30, 90, 40, 50, 70};

        int arr2[] = {3, 0, 1, 8, 7, 2, 5, 4, 9, 6};

        int arr3[] = {5, 1, 7, 9, 3, 8, 6};

        int arr4[] = {3, 0, 1, 8, 7, 2, 5, 4, 9, 6, 8, 9, 5, 1, 2,};

        int[] arr = arr4;

        quicksort(arr, 0, arr.length - 1);

        printArray(arr);


    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void quicksort(int[] arr, int leftIndex, int rightIndex) {


        if (leftIndex >= rightIndex) {
            return;
        }

        //pivot index = j
        int j = partitionNew(arr, leftIndex, rightIndex);
        quicksort(arr, leftIndex, j - 1);
        quicksort(arr, j + 1, rightIndex);


    }

    public static int partitionNew(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[lowIndex];
        int j = highIndex;
        int i = lowIndex;
        while (pivot < arr[j]) {
            j--;
        }
        if (arr[j] < pivot) {
            swap(arr, lowIndex, j);
        }


        while (arr[i] < pivot) {
            i++;
        }
        if (arr[i] > pivot) {
            swap(arr, i, j);
        }
        //0 1 2 3 -  6 8 5 4 9 7 pivot = 7 swap ten sonra
        //i =0
        //j=
        if (i != j) {

            while (arr[j] > pivot) {
                j--;
            }
            if (arr[j] < pivot) {
                swap(arr, i, j);
            }

            return j;

        }
        if (i != j) {
            while (arr[i] < pivot) {
                i++;
            }
            if (arr[i] > pivot) {
                swap(arr, i, j);
            }
        }


        return i;


    }

    public static int partition(int[] array, int lowIndex, int highIndex) {

        int pivot = array[lowIndex];

        int j = highIndex;

        while (pivot < array[j]) {
            j--;
        }

        if (pivot > array[j]) {
            int k = 0;

            swap(array, lowIndex, j);


            while (array[k] < pivot) {

                k++;
            }
            swap(array, k, j);

            while (k < j) {

                if (array[j] < pivot) {
                    swap(array, k, j);
                }
                j--;
            }


        }


        return j;
    }

    //  k     -  pivot


    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //                       ARRAY         3 = 5         6 = 8
    private static int swap2(int[] arr, int index1, int pivotIndex) {
        int temp2 = arr[pivotIndex];
        arr[pivotIndex] = arr[index1];
        arr[index1] = temp2;
        return index1;
    }

}
