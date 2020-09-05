package history.meituan0822;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/22 17:19
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n + 1];
        int[] num = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
            int left = 0;
            int max = 0;
            w[num[i]] = 0;

            for (int j = 1; j < n; j++) {
                left += w[j];
                if (w[j] == 0) {
                    max = max > left ? max : left;
                    left = 0;
                }
            }

            System.out.println(max);
        }
    }
}
