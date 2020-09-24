package whereWeGo.wy;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/24 19:39
 */
public class EBay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
        }

        for (int i = 2; i <= n; i++) {
            int c = 1;
            while (i - c > 0) {
                dp[i] += dp[i - c];
                c = c * 2;
            }
        }

        System.out.println(dp[n]);
    }

}
