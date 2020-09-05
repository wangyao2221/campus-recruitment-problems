package history.zhongjinsuo0827;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/27 13:49
 */
public class Main1 {
    static int[] arr;

    static int fun(int n, int index) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (index == 3) return 0;
        int num = 0;

        for (int i = 0; i <= n / arr[index]; i++) {
            num += fun(n - i * arr[index], index + 1);
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strs = line.replace(" ", "").split(",");
        arr = new int[strs.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        System.out.println(fun(1000, 0));
    }
}
