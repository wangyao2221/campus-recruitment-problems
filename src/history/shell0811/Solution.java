package history.shell0811;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 9;
        // int[] A = { 1, 2, 3, 4, 1, 1, 1, 5, 1 };
        int[] A = new int[n];
        int max = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            max = i == 0 ? A[i] : max | A[i];
        }
        System.out.println("max=" + max);
        for (int i = 0; i < n; i++) {
            int resi = A[i];
            if (resi == max) {
                System.out.println("1");
                // res[i] = 1;
                return;
            }
            res[i] = n;
            for (int j = i + 1; j < n; j++) {

                resi |= A[j];
                if (resi == max) {
                    res[i] = j - i + 1;
                    break;
                }

            }
            System.out.println("res[" + i + "]==" + res[i]);
        }
        int min = n;
        for (int i = 0; i < n; i++) {
            if (min > res[i])
                min = res[i];
        }
        // return min;
        System.out.println(min);
    }
}