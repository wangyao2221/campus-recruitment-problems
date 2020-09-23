package whereWeGo.wy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/23 18:48
 */
public class Main2 {
    static int n;
    static int[][] flag;
    static int[][] dp;
    static char[] arr1;
    static char[] arr2;
    static List<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        arr1 = new char[n];
        arr2 = new char[n];
        flag = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr2[i] = str1.charAt(2 * i);
            arr1[i] = str2.charAt(2 * i);
        }

        System.out.println(commonSubSequence());
    }

    public static int commonSubSequence() {
        n = arr1.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else if (dp[i][j + 1] >= dp[i + 1][j]) {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                    flag[i + 1][j + 1] = 1;
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j];
                    flag[i + 1][j + 1] = -1;
                }
            }
        }

        return dp[n][n];
    }
}
