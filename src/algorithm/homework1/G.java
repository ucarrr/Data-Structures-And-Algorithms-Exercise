package algorithm.homework1;

public class G {
    public static void main(String[] args) {
        int[] arr = {12, 7, 10, 9, 5, 4, 11, 1, 6, 2, 8};
        int[] arr1 = {12, 7, 10, 9, 5, 4, 11, 1, 6, 2, 8};

        int a = findmissing(arr1, 0, arr1.length - 1);

        System.out.println(a);
        printArray(arr1);
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static int partition(int[] arr, int left, int right) {
        int i = (left + right + 2) / 2;
        exchange(arr, i, right);
        int x = arr[right];
        i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= x) {
                exchange(arr, i, j);
                i += 1;
            }
        }
        exchange(arr, i, right);
        return i;
    }

    public static int findmissing(int[] arr, int left, int right) {
        if (left > right) {

            if (left >= right) {
                return arr[right] + 1;
            } else {
                return 1;
            }
        }

        int pivotIndex = partition(arr, left, right);

        if (arr[pivotIndex] == pivotIndex + 2) {
            return findmissing(arr, left, pivotIndex - 1);
        } else {
            return findmissing(arr, pivotIndex + 1, right);
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
