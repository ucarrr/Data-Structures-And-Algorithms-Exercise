package algorithm;

public class Main {
    public static void main(String[] args) {

        int [] arr={2 ,1, 5, 4,1, 3};
        int [] arr2={5, 2, 4, 1, 3};
        int arr3[] = { 12, 11, 13, 5, 6, 7 };

       // InsertionSort insertionSort= new InsertionSort();
       // insertionSort.sort(arr);

        MergeSort merge=new MergeSort();
        merge.mergeSort(arr2);


        printArray(arr2);


    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
