package netease0912.wy;

import java.util.Scanner;

/**
 * 送快递
 * @author wangyao2221
 * @date 2020/9/12 15:03
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] S = new int[n - 1];
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            S[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            matrix[S[i - 1]][i] = 1;
            matrix[i][S[i - 1]] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int start, int[][] matrix, int remain) {

    }
}
