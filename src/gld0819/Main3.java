package gld0819;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/8/19 22:09
 */
public class Main3 {
    public class Node {
        Integer key;
        Integer value;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        PriorityQueue queue = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        int n = sc.nextInt();
        int C = sc.nextInt() * 100;
        int[] cs = new int[n];
        int[] vs = new int[n];

        for (int i = 0; i < n; i++) {
            cs[i] = (int)sc.nextFloat() * 100;
            vs[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][C + 1];
        for (int i = 0; i <= C; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= C; c++) {
                if (c - cs[i - 1] < 0) {
                    dp[i][c] = dp[i - 1][c];
                } else {
                    dp[i][c] = Math.max(dp[i - 1][c - cs[i - 1]] + vs[i - 1], dp[i - 1][c]);
                }
            }
        }

        System.out.println(dp[n][C]);
    }
}
