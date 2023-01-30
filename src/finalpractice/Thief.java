package finalpractice;

public class Thief {

    /*
    Imagine a thief entering a house. In the house,
    there are infinitely many items
    that can have only one of three different weights: 1 kg, 3 kgs, and 5 kgs.
    All of the items are discrete. The thief has a bag capacity of n kgs and strangely,
    he wants to steal the “smallest number of items”.
    */
    public static void main(String[] args) {
        System.out.println(recursiveSol(15));
    }

    public static int recursiveSol(int n){
        int i=0;
        if (n == 0) {
            return 1;

        } else if (n < 0) {
            return 0;
        } else
            return  1+min(recursiveSol(n - 1), recursiveSol(n - 3), recursiveSol(n - 5));

    }
    private static int min(int smallNumber, int smallNumber1, int smallNumber2) {

        int minValue1=Math.min(smallNumber,smallNumber1);
        int minValue2=Math.min(minValue1,smallNumber2);

        if (minValue1 < minValue2) {
            return minValue1;
        }
        return minValue2;
    }

}
