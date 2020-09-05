package history.tencent;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[][] a = new int[m][2];
            int[][] b = new int[m][2];

            for (int j = 0; j < m; j++) {
                a[j][0] = sc.nextInt();
                a[j][1] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                b[j][0] = sc.nextInt();
                b[j][1] = sc.nextInt();
            }

            float result = fun(a, b);
            if (result == 0) {
                System.out.println("0.000");
            } else {
                System.out.println((int) (result * 1000) / 1000.0);
            }
        }
    }

    public static float fun(int[][] a, int[][] b) {
        float minDist = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                float dist = dist(a[i], b[j]);
                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }
        return minDist;
    }

    public static float dist(int[] a, int[] b) {
        return (float) Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
    }
}
