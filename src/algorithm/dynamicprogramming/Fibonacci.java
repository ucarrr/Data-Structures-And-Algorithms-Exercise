package algorithm.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(iterativeFibonacci(5));

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
    //Bottom-UP Approach
    //Bottom-UP(Dynamic Programming)
    public static int iterativeFibonacci(int n) {
        int[] fib = new int[n+2];
        if (n <= 1) {
            return n;
        }
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }




    //Top-Down(Memoization)
    //Top down approach
    public static int dynamicSolutionFib(int n) {
        int[] arr = new int[10];
        if (n <= 1)
            return n;

        // Temporary variables to store
        // values of fib(n-1) & fib(n-2)
        int first, second;

        if (arr[n - 1] != -1)
            first = arr[n - 1];
        else
            first = dynamicSolutionFib(n - 1);

        if (arr[n - 2] != -1)
            second = arr[n - 2];
        else
            second = dynamicSolutionFib(n - 2);

        // Memoization
        return arr[n] = first + second;




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
