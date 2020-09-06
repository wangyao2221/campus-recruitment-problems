package tencent0906.wy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/6 19:20
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = fun(arr1, arr2);
        for (int i = 0; i < result.size(); i++) {
            if (i == 0) {
                System.out.print(result.get(i));
            } else {
                System.out.print(" " + result.get(i));
            }
        }
        System.out.println();
    }

    public static List<Integer> fun(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        if (arr1.length == 0 || arr2.length == 0) return result;

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) i++;
            else if (arr1[i] < arr2[j]) j++;
            else if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        return result;
    }
}
