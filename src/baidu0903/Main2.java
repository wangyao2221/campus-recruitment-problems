package baidu0903;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/3 20:30
 */
public class Main2 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            count = 0;
            int cowNum = sc.nextInt();
            int featureNum = sc.nextInt();
            int[][][] arr = new int[featureNum][][];
            for (int i = 0; i < featureNum; i++) {
                int m = sc.nextInt();
                arr[i] = new int[m][2];
                for (int j = 0; j < m; j++) {
                    arr[i][j][0] = sc.nextInt();
                    arr[i][j][1] = sc.nextInt();
                }
            }
            String result = fun(arr);
            System.out.println(count);
            System.out.println(result);
        }
    }

    public static String fun(int[][][] arr) {
        String result = "";
        int[][] tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = intersection(tmp, arr[i]);
        }

        for (int i = 0; i < tmp.length; i++) {
            for (int j = tmp[i][0]; j <= tmp[i][1]; j++) {
                result += j + " ";
                count++;
            }
        }

        return result.substring(0, result.length() - 1);
    }

    public static int[][] intersection(int[][] A, int[][] B) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int low = Math.max(A[i][0], B[j][0]);
            int high = Math.min(A[i][1], B[j][1]);

            if (low <= high) {
                result.add(new int[]{low, high});
            }

            if (A[i][1] < B[j][1]) i++;
            else j++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
