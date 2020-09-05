package history.yuanfudao0822;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/22 19:22
 */
public class Main2 {
    static int maxn = 1005;
    static int sum, ans;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[m][n];
        dp = new int[m + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][i] = sc.nextInt();
            }
        }

//        int max = 0;
//        for (int i = 0; i < m; i++) {
//            int[] tmp = matrix[m - 1];
//            for (int j = m - 1; j > 0; j--) {
//                matrix[j] = matrix[j - 1];
//            }
//            matrix[0] = tmp;
//            int res = fun(matrix, n, m);
//            if (res > max) max = res;
//        }
//        System.out.println(fun(matrix, n, m));

        fun(matrix, n, m);

        int sum = 0;
        int[] dpp = new int[m];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dpp[i - 1] < dp[i][j]) {
                    dpp[i - 1] = dp[i][j];
                }
            }
        }

        for (int i = 0; i < dpp.length; i++) {
            sum += dpp[i];
        }

        System.out.println(sum);
    }

    public static int fun(int[][] matrix, int m, int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                dp[j][i] = matrix[j - 1][i - 1] + dp[j - 1][i];
            }
        }

        ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum = 0;
                for (int k = 1; k <= m; k++) {
                    sum = Math.max(0, sum + dp[j][k] - dp[i - 1][k]);
                    ans = Math.max(ans, sum);
                }
            }
        }

        return ans;
    }
}
