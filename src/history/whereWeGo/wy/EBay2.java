package history.whereWeGo.wy;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/24 19:27
 */
public class EBay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (tmp % k == 0) {
                    count++;
                }
            }

            if (count >= m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
