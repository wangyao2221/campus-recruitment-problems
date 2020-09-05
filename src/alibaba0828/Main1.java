package alibaba0828;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/28 19:22
 */
public class Main1 {
    int a = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1};
        int[] arr2 = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(fun(arr1, arr2));
    }

    public static int fun(int[] arr1, int[] arr2) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
            if (arr1[i] != arr2[i]) count1++;
            if (arr1[j] != arr2[i]) count2++;
        }

        if (count1 % 2 == 0) count1 /= 2;
        else count1 = count1 / 2 + 1;

        if (count2 % 2 == 0) count2 /= 2;
        else count2 = count2 / 2 + 1;

        return count2 + 1 < count1 ? count2 + 1 : count1;
    }
}
