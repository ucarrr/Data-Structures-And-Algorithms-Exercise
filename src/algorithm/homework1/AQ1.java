package algorithm.homework1;

public class AQ1 {

    public static void main(String[] args)
    {
        int[] arr = {9,3,4,5,10,11,8,7,2,12,1};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public  static int partition(int[] arr, int low, int high)
    {

        swap(arr, low, high);
        int pm = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pm) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            if(pi+1==arr[pi]){
                quickSort(arr, pi + 1, high);
            }else{
                quickSort(arr, low, pi - 1);
            }
        }else{

            if(low==high && arr[high]==low+1){
                System.out.println(arr[high]+1);
            }
            else if(low==high && arr[high]<low+1){
                System.out.println(arr[high]-1);
            }  else if(low==high && arr[high]>low+1){
                System.out.println(arr[high]-1);
            }
            else if(low>high && arr[high]<low){
                System.out.println(arr[high]+1);
            }
            else if(low>high && arr[high]>low){
                System.out.println(arr[high]-1);
            }
            else if(low>high && arr[high]==low){
                System.out.println(arr[high]+1);
            }
        }
    }


}
