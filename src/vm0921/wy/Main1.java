package vm0921.wy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/9/21 20:31
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt();
            int[] arr1 = new int[m];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                int tmp = sc.nextInt();
                if (stack.isEmpty() || stack.peek() != tmp) {
                    stack.push(tmp);
                }
            }

            for (int i = m - 1; i >= 0; i--) {
                if (stack.isEmpty()) {
                    break;
                }
                if (stack.peek() == arr1[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
