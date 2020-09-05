package meituan0822;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/22 16:06
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String str = sc.next();
            fun(str);
        }
    }

    public static void fun(String str) {
        char[] chs = str.toCharArray();
        int condition1 = 0;
        int condition2 = 1;

        if (!((chs[0] >= 'A' && chs[0] <= 'Z') || (chs[0] >= 'a' && chs[0] <= 'z'))) {
            System.out.println("Wrong");
            return;
        }

        if (chs.length == 1) {
            System.out.println("Wrong");
            return;
        }

        for (int i = 1; i < chs.length; i++) {
            int flag1 = 0;
            int flag2 = 0;

            if (chs[i] >= '0' && chs[i] <= '9') {
                condition1 = 1;
                flag1 = 1;
            }

            if ((chs[i] >= 'A' && chs[i] <= 'Z') || (chs[i] >= 'a' && chs[i] <= 'z')) {
                flag2 = 1;
            }

            if (flag1 + flag2 != 1) {
                condition2 = 0;
                break;
            }
        }
        if (condition1 == 1 && condition2 == 1) {
            System.out.println("Accept");
        } else {
            System.out.println("Wrong");
        }
    }
}
