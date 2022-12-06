package algorithm.homework1;

import java.util.Random;

public class E {

       public static void main(String[] args) {

        /*int[]array={3,0,1,8,7,2,5,4,9,6};
        double a= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        printArray(array);

        double b= System.currentTimeMillis();
        System.out.println("");
        System.out.println(b-a);*/

        Random random=new Random();
        int [] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(1000);
        }

        printArray(array);
        System.out.println("");
        double start1= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end1= System.currentTimeMillis();
        System.out.println("Array1 time:  ");
        System.out.println(end1-start1);
        printArray(array);

        /*int [] array2 = new int[20000];

        for (int i = 0; i < array2.length; i++) {
            array2[i]=random.nextInt(200000);
        }

        double start2= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end2= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start2-end2);

        int [] array3 = new int[30000];

        for (int i = 0; i < array3.length; i++) {
            array3[i]=random.nextInt(300000);
        }

        double start3= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end3= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start3-end3);

        int [] array4 = new int[40000];

        for (int i = 0; i < array4.length; i++) {
            array4[i]=random.nextInt(400000);
        }

        double start4= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end4= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start4-end4);

        int [] array5 = new int[50000];

        for (int i = 0; i < array5.length; i++) {
            array5[i]=random.nextInt(500000);
        }

        double start5= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end5= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start5-end5);

        int [] array6 = new int[60000];

        for (int i = 0; i < array6.length; i++) {
            array6[i]=random.nextInt(600000);
        }

        double start6= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end6= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start6-end6);

        int [] array7 = new int[70000];

        for (int i = 0; i < array7.length; i++) {
            array7[i]=random.nextInt(700000);
        }

        double start7= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end7= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start7-end7);

        int [] array8 = new int[80000];
[16:58, 19.11.2022] Tatlı Cadı: for (int i = 0; i < array8.length; i++) {
            array8[i]=random.nextInt(800000);
        }

        double start8= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end8= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start8-end8);

        int [] array9 = new int[90000];

        for (int i = 0; i < array9.length; i++) {
            array9[i]=random.nextInt(900000);
        }

        double start9= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end9= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start9-end9);

        int [] array10 = new int[100000];

        for (int i = 0; i < array10.length; i++) {
            array10[i]=random.nextInt(1000000);
        }

        double start10= System.currentTimeMillis();
        quickSortmetod(array,0,array.length-1);
        double end10= System.currentTimeMillis();
        System.out.print("Array1 time:  ");
        System.out.println(start10-end10);*/

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
            if(indexPivot < j) {
                while (pivot<A[j]){
                    j--;
                }

                int temp1 = A[indexPivot];
                A[indexPivot] = A[j];
                A[j] = temp1;
                //swap(A,indexPivot,j);

                //swap2(indexPivot,j);
                int index1=indexPivot;
                indexPivot=j;
                j=index1;
            }

            // pivot sağdaysa
            else if(indexPivot > j) {
                while (pivot>A[j]){
                    j++;
                }

                int temp2 = A[indexPivot];
                A[indexPivot] = A[j];
                A[j] = temp2;
                //swap(A, indexPivot, j)

                int index2=indexPivot;
                indexPivot=j;
                j=index2;
                //swap2(indexPivot,j);
            }
        }
        return indexPivot;
    }



    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void swap2(int a, int b){
        int i=a;
        a=b;
        b=i;
    }


    public static void printArray(int[]array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void createRandomArray(int [] arrayy){
        Random r = new Random();
        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i]=r.nextInt(1000000);
        }
    }
}
