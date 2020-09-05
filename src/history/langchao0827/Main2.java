package history.langchao0827;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/27 12:43
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];

        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = sc.nextInt();
        }

        // 哨兵
        arr[n + 1] = 102;
        arr[n] = 101;

        int firstIndex = 1;
        int secondIndex = 2;

        Arrays.sort(arr);

        int max = 0;
        int fromIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = 0;
            if (arr[i] % 2 == 1) {
//                len = (arr[i] - 2 - firstIndex) / 2 + 1;
                len = (arr[i] - firstIndex) / 2;
                if (len > max) {
                    max = len;
                    fromIndex = firstIndex;
                }
                firstIndex = arr[i] + 2;
            } else {
//                len = (arr[i] - 2 - secondIndex) / 2 + 1;
                len = (arr[i] - secondIndex) / 2;
                if (len > max) {
                    max = len;
                    fromIndex = secondIndex;
                }
                secondIndex = arr[i] + 2;
            }
        }

        System.out.println(fromIndex + " " + max);
    }
}
