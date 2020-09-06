package tencent0906.wy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/6 20:24
 */
public class Main4PassAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        int size = arr.length;
        if (size % 2 == 0) {
            int middle = size / 2;
            for (int i = 0; i < n; i++) {
                if (i < middle) {
                    System.out.println(arr[middle]);
                } else if (i >= middle) {
                    System.out.println(arr[middle - 1]);
                }
            }
        } else {
            int middle = size / 2;
            for (int i = 0; i < n; i++) {
                if (i < middle) {
                    System.out.println((arr[middle] + arr[middle + 1]) / 2);
                } else if (i == middle) {
                    System.out.println((arr[middle - 1] + arr[middle + 1]) / 2);
                } else {
                    System.out.println((arr[middle - 1] + arr[middle]) / 2);
                }
            }
        }
    }
}
