package whereWeGo.wy;

import vm0921.jyh.Main;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/23 18:48
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] arr1 = new char[n];
        char[] arr2 = new char[n];

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr1[i] = str1.charAt(2 * i);
            arr2[i] = str2.charAt(2 * i);
        }

        System.out.println(commonSubSequence(arr1, arr2));
    }

    public static int commonSubSequence(char[] arr1, char[] arr2) {
        int n = arr1.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(Math.max(dp[i + 1][j], dp[i][j + 1]), dp[i][j]);
                }
            }
        }

        return dp[n][n];
    }
}
