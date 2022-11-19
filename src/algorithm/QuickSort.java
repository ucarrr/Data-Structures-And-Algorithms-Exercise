package algorithm;

import java.util.Random;

public class QuickSort {



    public static int partition(int[] array, int lowIndex, int highIndex, int pivot) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;

            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);


        return leftPointer;
    }

    public static void quicksort(int array){

    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        //int pivotIndex= new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[highIndex];
       // swap(array,pivotIndex,highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);


        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

    }

    public static void quicksort2(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }


        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;

            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);


    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }





}
