package algorithm;

public class MergeSort {

     //5 2 4 1 3
    public void mergeSort(int [] arr){
        int arrayLength=arr.length;   // 5

        if(arrayLength < 2){
            return;
        }
        int midIndex = arrayLength / 2;  // 2

        int [] leftHalf=new int[midIndex]; // 2

        int [] rightHalf=new int[arrayLength-midIndex]; // 3

        for (int i = 0; i < midIndex; i++) {
             leftHalf[i]=arr[i];
        }

        for (int i = midIndex; i < arrayLength ; i++) {
            rightHalf[i-midIndex]=arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr,leftHalf,rightHalf);


    }
    public void merge(int[] arr, int[] leftHalf, int[] rightHalf){

        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;

        int l = 0, r = 0, k = 0;

        while( l < leftSize && r < rightSize){
            if(leftHalf[l] <= rightHalf[r]){
                arr[k] = leftHalf[l];
                l++;
            }else{
                arr[k]=rightHalf[r];
                r++;
            }
            k++;

        }
        while(l < leftSize){
            arr[k]=leftHalf[l];
            l++;
            k++;
        }
        while (r < rightSize){
            arr[k]=rightHalf[r];
            r++;
            k++;
        }


    }

}
