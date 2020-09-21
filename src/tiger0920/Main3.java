package tiger0920;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/20 17:06
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i += 2) {
            int tmp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = tmp;
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(" " + arr[i]);
            }
        }
    }
}
