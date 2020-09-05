package history.tencent;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static class SQueue {
        Stack<Integer> pushStack = new Stack<>();
        Stack<Integer> popStack = new Stack<>();

        public void add(Integer elem) {
            pushStack.push(elem);
        }

        public Integer peek() {
            if (popStack.size() == 0) {
                while (!pushStack.empty()) {
                    popStack.push(pushStack.pop());
                }
            }
            return popStack.peek();
        }

        public Integer poll() {
            if (popStack.size() == 0) {
                while (!pushStack.empty()) {
                    popStack.push(pushStack.pop());
                }
            }
            return popStack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SQueue queue = new SQueue();
        for (int i = 0; i < n; i++) {
            doOp(queue, sc.nextLine());
        }
    }

    public static void doOp(SQueue queue, String op) {
        String[] ops = op.split(" ");
        if (ops.length == 1) {
            if ("peek".equals(ops[0])) {
                Integer integer = queue.peek();
                if (integer == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
            } else if ("poll".equals(ops[0])) {
                Integer integer = queue.poll();
                if (integer == null) {
                    System.out.println("-1");
                }
            }
        } else if (ops.length == 2) {
            queue.add(Integer.parseInt(ops[1]));
        }
    }
}
