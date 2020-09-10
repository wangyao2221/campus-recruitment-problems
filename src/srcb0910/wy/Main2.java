package srcb0910.wy;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/10 19:13
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int current = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (current + tmp < k) {
                current += tmp;
            } else if (current + tmp == k) {
                current = 0;
                count++;
            } else {
                current = tmp;
                count++;
            }
        }

        System.out.println(count);
    }
}
