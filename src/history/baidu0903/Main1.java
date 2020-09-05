package history.baidu0903;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/3 19:41
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        String result = "";

        int num0 = 0;
        int num5 = 0;

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                num0++;
            } else {
                num5++;
            }
        }

        if (num0 == 0) {
            System.out.println(-1);
        } else if (num5 < 9) {
            System.out.println(0);
        } else {
            String str = "555555555";

            for (int i = 0; i < num5 / 9; i++) {
                result += str;
            }
            for (int i = 0; i < num0; i++) {
                result += 0;
            }
            System.out.println(result);
        }
    }
}
