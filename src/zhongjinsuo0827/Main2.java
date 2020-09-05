package zhongjinsuo0827;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/27 13:49
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {3500, 4320, 4890, 5000, 5340, 6003, 6688};
        int[] arr2 = new int[7];

        for (int i = 0; i < 7; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr2);
        int[] result = merge(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[index++] = arr1[i++];
            } else {
                result[index++] = arr2[j++];
            }
        }

        if (i < arr1.length) {
            while (i < arr1.length) {
                result[index++] = arr1[i];
                i++;
            }
        }

        if (j < arr2.length) {
            while (j < arr2.length) {
                result[index++] = arr2[j];
                j++;
            }
        }

        return result;
    }
}
