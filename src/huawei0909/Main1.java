package huawei0909;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/9 18:55
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] perfectApp = new int[n];
        int[] perfectPrice = new int[n];

        for (int i = 0; i < n; i++) {
            perfectApp[i] = sc.nextInt();
            perfectPrice[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] app = new int[m];
        int[] price = new int[m];

        for (int i = 0; i < n; i++) {
            app[i] = sc.nextInt();
            price[i] = sc.nextInt();
        }

        int reuslt = fun(perfectApp, perfectPrice, app, price);
    }

    private static int fun(int[] perfectApp, int[] perfectPrice, int[] app, int[] price) {
        return 0;
    }
}
