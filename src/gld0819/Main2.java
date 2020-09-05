package gld0819;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/19 21:47
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] arr = new long[4];
        long sum = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        while (arr[3] > arr[2]) {
            if (arr[3] > arr[0] + 2) {
                arr[3] -= 2;
                arr[0] += 1;
            } else {
                break;
            }
        }

        while (arr[2] > arr[1] + 2) {
            arr[2] -= 2;
            arr[1] += 1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sum += arr[i];
            } else {
                sum = -1;
                break;
            }
        }
        sum += arr[3];

        System.out.println(sum);
    }
}
