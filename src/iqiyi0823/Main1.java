package iqiyi0823;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/23 15:30
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fun(num));
    }

    public static int fun(int num) {
        int twoCount = 0;
        int fiveCount = 0;
        for (int i = 2; i <= num; i++) {
            int tmp = i;
            while (tmp % 2 == 0) {
                tmp /= 2;
                twoCount++;
            }

            while (tmp % 5 == 0) {
                tmp /= 5;
                fiveCount++;
            }
        }

        return twoCount < fiveCount ? twoCount : fiveCount;
    }
}
