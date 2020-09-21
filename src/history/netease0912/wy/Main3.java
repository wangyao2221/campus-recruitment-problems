package history.netease0912.wy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 送快递
 * @author wangyao2221
 * @date 2020/9/12 15:03
 */
public class Main3 {
    static int max = 0;
    static HashSet<Integer> set = new HashSet<>();

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

        int count = 1;
        fun(matrix, 0, n, k, count);
        System.out.println(max);
    }

    private static void fun(int[][] matrix, int index, int n, int k, int count) {
        if (k == 0) {
            max = Math.max(max, count);
        } else {
            for (int i = 0; i < n; i++) {
                if (matrix[index][i] == 1 && !set.contains(i)) {
                    set.add(i);
                    fun(matrix, i, n, k - 1, count + 1);
                    set.remove(i);
                }
            }

            if (k >= 0) max = Math.max(max, count);
        }
    }

}
