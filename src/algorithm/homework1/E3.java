package algorithm.homework1;

import java.util.Random;

public class E3 {
    public static void main(String[] args) {

        int a= (int) Math.pow(2,16);//65.kusur
        Random random=new Random();
        int [] array = new int[a];
        int n=array.length;
        int v=6;
        int k=v*n/16;
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(1000000);
        }
        sort(array); // banka nuara sırasına göre sıralı

        //kaydırma yapılıyor
        for(int i = 0; i < k; i++){
            int j, last;
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){

                array[j] = array[j-1];
            }
            array[0] = last;
        }

        //kaydırılmış diziyi düzeltmek için insertionsort

        double start= System.currentTimeMillis();
        sort(array);
        double finish= System.currentTimeMillis();

        System.out.println("time:  ");
        System.out.println(finish-start); // hesaplanmasını istediğim kısım insertion sort o kısmı currenttime kullanarak hesapladım
        //printArray(array);


        //shift


        //printArray(array);


    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }


}
