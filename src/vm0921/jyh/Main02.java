package vm0921.jyh;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n-- > 0) {
            int tt = in.nextInt();
            int[] arr = new int[tt];
            Stack<Integer> stacOVer = new Stack<>();

            int[] result = {1,2,2,3,2,32,23,23,2,3};
            int[] tmp = {1,3,2,3,23,2,3};
            int len = tmp.length;
            int flag = 1;
            int first = result[0];
            for (int i = 0; i < len; i++) {
                if (result[i] != first) flag = 0;
                tmp[i] = result[i];
                if (tmp[i] > result[0]) {
                    result[0] = tmp[i];
                }
            }


//            double r = workLen;
//            int times = (int) ((int)r / (4 * n));
//            r = r - times*n*4;
//                while (r > 0) {
//                    if (x < n && y == 0) {
//                        tmp = x;
//                        x += r;
//                        if (x > n) {
//                            x = n;
//                            r -= n - tmp;
//                        }
//                        else r = 0;
//                    }
            input02(in, tt, arr);
            inputIn(in, tt, stacOVer);
            for (int i = tt - 1; i >= 0; i--) {
                if (stacOVer.isEmpty()) {
                    break;
                }
                find(arr, stacOVer, i);
            }

            result(stacOVer);
        }
    }

    private static void input02(Scanner in, int tt, int[] arr) {
        for (int i = 0; i < tt; i++) {
            arr[i] = in.nextInt();
        }
    }

    private static void inputIn(Scanner in, int tt, Stack<Integer> stacOVer) {
        for (int i = 0; i < tt; i++) {
            int tmp = in.nextInt();
            if (stacOVer.isEmpty() || stacOVer.peek() != tmp) {
                stacOVer.push(tmp);
            }
        }
    }

    private static void result(Stack<Integer> stacOVer) {
        if (stacOVer.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void find(int[] arr, Stack<Integer> stacOVer, int i) {
        if (stacOVer.peek() == arr[i]) {
            stacOVer.pop();
        }
    }
}
