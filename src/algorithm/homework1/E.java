package algorithm.homework1;

public class E {

    public static void main(String[] args) {
        int[]array={3,0,1,8,7,2,5,4,9,6};
        quickSortmetod(array,0,array.length-1);

        printArray(array);

    }

    public static void quickSortmetod(int [] A ,int left, int right){
        if(left<right){
            int j= partition(A,left,right);
            quickSortmetod(A,left,j-1);
            quickSortmetod(A,j+1,right);
        }
    }


    public static int partition(int [] A, int indexPivot, int indexJ){ //indexPivot-->left, indexJ-->right
        //3,0,1,8,7,2,5,4,9,6  //2,0,1,8,7,3,5,4,9,6
        int pivot=A[indexPivot];
        int j=indexJ;

        while(indexPivot!=j){
            //j pivotun neresinde pivot soldaysa
            while(indexPivot < j) {
                while (pivot<A[j]){
                    j--;
                }

                int temp1 = A[indexPivot];
                A[indexPivot] = A[j];
                A[j] = temp1;
                int index1=indexPivot;
                indexPivot=j;
                j=index1;

                //swap(A,A[j],pivot);
            }

            // pivot sağdaysa
            while(indexPivot > j) {
                while (pivot>A[j]){
                    j++;
                }

                int temp2 = A[indexPivot];
                A[indexPivot] = A[j];
                A[j] = temp2;
                int index2=indexPivot;
                indexPivot=j;
                j=index2;
                //swap(A,A[j],pivot);
            }

        }

        return indexPivot;
    }


    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[]array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
