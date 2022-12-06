package algorithm.homework1;

import java.util.Random;

public class E2 {
    public static void main(String[] args) {
        int onBin = 10000;
        int yuzMil = 100000000;
        int onKat = ((10 ^ 1) - 1);
        Random random = new Random();
        int[] array = new int[onKat];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(onKat);
        }


        System.out.println("");
        double start1 = System.currentTimeMillis();
        quicksort(array, 0, array.length - 1);
        double end1 = System.currentTimeMillis();
        System.out.println("Array1 time:  ");
        System.out.println(end1 - start1);
        printArray(array);
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;

        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);

            do {
                right--;
            } while (arr[right] > pivot);

            if (left >= right) {
                return right;
            }
            swap(arr, left, right);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quicksort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int j = partition(arr, low, high);

        quicksort(arr, low, j);
        quicksort(arr, j + 1, high);
    }
}
