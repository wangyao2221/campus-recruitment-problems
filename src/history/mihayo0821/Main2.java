package history.mihayo0821;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/21 20:38
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] flag = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (flag[j] == 0) {
                    flag[j] = num;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (flag[i] == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
