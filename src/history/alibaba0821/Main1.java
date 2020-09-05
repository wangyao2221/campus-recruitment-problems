package history.alibaba0821;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/21 18:28
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(find(arr));
        }
    }

    public static int find(int[] arr) {
        int time = 0;
        int end=  arr.length - 1;
        while (end >= 3) {
            int oneTran = arr[end] + arr[end - 1] + arr[0] * 2;
            int twoTran = arr[end] + arr[0] + arr[1] * 2;
            int tmp = oneTran > twoTran ? oneTran : twoTran;
            time += tmp;
            end -= 2;
        }

        int r1 = arr[0] * (arr.length - 2);
        for (int i = 0; i < arr.length; i++) {
            r1 += arr[i];
        }
        return time;
    }
}
