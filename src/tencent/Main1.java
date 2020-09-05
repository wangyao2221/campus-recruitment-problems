package tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());
            Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < m; j++) {
                doOp(queue, sc.nextLine());
            }
        }
    }

    public static void doOp(Queue<Integer> queue, String op) {
        String[] ops = op.split(" ");
        if (ops.length == 1) {
            if ("TOP".equals(ops[0])) {
                Integer integer = queue.peek();
                if (integer == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
            } else if ("POP".equals(ops[0])) {
                Integer integer = queue.poll();
                if (integer == null) {
                    System.out.println("-1");
                }
            } else if ("SIZE".equals(ops[0])) {
                System.out.println(queue.size());
            } else if ("CLEAR".equals(ops[0])) {
                queue.clear();
            }
        } else if (ops.length == 2) {
            queue.offer(Integer.parseInt(ops[1]));
        }
    }
}
