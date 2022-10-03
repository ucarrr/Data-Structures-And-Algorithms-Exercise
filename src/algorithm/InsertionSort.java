package algorithm;

public class InsertionSort {



    public InsertionSort( ) {

    }

         // key --> 1 yada o anki değer
         // j --> değer bir önceki değer
    //2 1 5 4 1 3
    public void sort(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            int key =arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]> key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j + 1] = key;


        }
    }

}
