package history.tencent;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] flag = new int[n];
        int[] tmp = new int[n];
        Arrays.fill(flag, 1);

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

            }
        }
    }

    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void update(int[] newArr, int[] a, int[] b, int[] flag, int m, int n) {
        flag[m] = -flag[m];
        flag[n] = -flag[n];

        if (flag[m] == 1) {
            newArr[m] = a[m];
        } else {
            newArr[m] = b[m];
        }

        if (flag[n] == 1) {
            newArr[n] = a[n];
        } else {
            newArr[n] = b[n];
        }
    }

    public static void swap(int[] arr, int m, int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
