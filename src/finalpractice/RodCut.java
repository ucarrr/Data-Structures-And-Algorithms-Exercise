package finalpractice;

//Dynamic Programming solution
public class RodCut {
    public static void main(String[] args) {

        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int price2[] = {3, 5, 8, 9, 10, 17, 17, 20};
        int size = price.length;

        System.out.println("Maximum Obtainable Value is " +
                cutRod(price, size));
    }

    private static int cutRod(int[] arr, int n) {

        int prices[] = new int[n + 1];

        prices[0] = 0;


        for (int i = 1; i <= n; i++) {

            int maxRrice = Integer.MIN_VALUE;

            for (int j = 0; j < i; j++) {

                maxRrice = Math.max(maxRrice, arr[j] + prices[i - j - 1]);

            }

            prices[i] = maxRrice;

        }


        return prices[n];
    }


}
