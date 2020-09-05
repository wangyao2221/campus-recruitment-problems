package yonyou0818;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/18 15:21
 */
public class Main3 {
    private static final int MAX = 99999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int[] result = fun(3, matrix, 0);
        System.out.println(Arrays.toString(result));
//        while (sc.hasNext()) {
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int[][] matrix = new int[n + 1][n + 1];
//            for (int i = 0; i < n + 1; i++) {
//                for (int j = 0; j < n + 1; j++) {
//                    matrix[i][j] = MAX;
//                }
//            }
//            int x = 0, y = 0;
//            for (int i = 0; i < m; i++) {
//                x = sc.nextInt();
//                y = sc.nextInt();
//                matrix[x][y] = sc.nextInt();
//            }
//            System.out.println(dijk(matrix, 0, n));
//        }
    }

    public static int[] fun(int n, int[][] matrix, int start) {
        int[][] mat = new int[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(mat[i], MAX);
        }

        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][0];
            int y = matrix[i][1];
            mat[x][y] = matrix[i][2];
        }

        int[] result = dijk(mat, start);

        for (int i = 0; i < result.length; i++) {
            if (result[i] == MAX) result[i] = -1;
            if (i == start) result[i] = 0;
        }
        return result;
    }

    //    public static int[] dijk(int[][] matrix, int start) {
//        int n = matrix.length - 1;
//        int[] d = new int[n];
//        boolean[] s = new boolean[n];
//        d[start] = 0;
//        s[start] = true;
//        for (int i = 0; i < n; i++) {
//            s[i] = false;
//            d[i] = matrix[start][i];
//        }
//        int k = 0;
//        for (int i = 1; i < n; i++) {
//            int min = MAX;
//            for (int j = 0; j < n; j++) {
//                if (!s[j] && d[j] < min) {
//                    k = j;
//                    min = d[j];
//                }
//            }
//            s[k] = true;
//            for (int j = 0; j < n; j++) {
//                if (!s[j] && d[k] + matrix[k][j] < d[j]) {
//                    d[j] = d[k] + matrix[k][j];
//                }
//            }
//        }
//        return d;
//    }
    public static int[] dijk(int[][] matrix, int start) {
        int[] d = new int[matrix.length];
        return null;
    }
}
