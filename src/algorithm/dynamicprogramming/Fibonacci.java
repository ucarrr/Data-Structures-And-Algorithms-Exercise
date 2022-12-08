package algorithm.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(recursiveFibonacci(0));

    }

    //Fibonacci  =0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    //            0  1  2  3  4  5  6  7   8   9

    //Top-Down approach
    public static int recursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        //
        return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);

        /*
                                     1, 1, 2, 3

                                     fibonacci(4)
                        ------------------ 3 ---------------
                          |                                 |
                    fibonacci(2)         +             fibonacci(3)
               --------- 1 ---------                --------- 2 ----------
                 |                |                  |               |
               fibonacci(0) +  fibonacci(1)      fibonacci(1)  +  fibonacci(2)
                      0               1               1           ------- 1 -------
                                                                 |             |
                                                           fibonacci(0) + fibonacci(1)
                                                                 0             1
         */

    }


    //Table - Tabulation
    //Bottom-up Approach
    //Bottom-Up(Dynamic Programming)
    public static int iterativeFibonacci(int n) {
        int[] arr = new int[n];
        if (n <= 1) {
            return n;
        }
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }



    //Top-Down(Memoization)
    public static void dynamicSolutionFib(int n) {




/*
                                                                  1, 1, 2, 3, 5

                                                                   fibonacci(5)
                                            --------------------------------------------------------
                                            |                                                  |
                                     fibonacci(4)                                       fibonacci(3)
                        ------------------ 3 ---------------                         --------- 2 ----------
                          |                                 |                            |               |
                    fibonacci(2)         +             fibonacci(3)                 fibonacci(1)  +  fibonacci(2)
               --------- 1 ---------                --------- 2 ----------                         ------- 1 -------
                 |                |                  |               |                             |             |
               fibonacci(0) +  fibonacci(1)      fibonacci(1)  +  fibonacci(2)                fibonacci(0) + fibonacci(1)
                      0               1               1           ------- 1 -------
                                                                 |             |                  0             1
                                                           fibonacci(0) + fibonacci(1)

                                                                 0             1


                     fibonacci(3) --> 2   again call same parameters
                     fibonacci(2) --> 3
                     fibonacci(1) --> 5
                     fibonacci(0) --> 3
         */
    }
}
