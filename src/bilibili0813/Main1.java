package bilibili0813;

import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/8/13 18:57
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(new Main1().Game24Points(new int[]{7, 2, 1 ,10}));
    }

    public boolean Game24Points(int[] arr) {
        float[] farr = new float[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            farr[i] = arr[i] * 1.0F;
        }

        // write code here
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    float res = calc(farr, new int[]{i, j, k});
                    if (res == 24) {
                        System.out.println(i + " " + j + " " + k);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public float calc(float[] arr, int[] op) {
        Stack<Float> numStack = new Stack<>();
        Stack<Integer> opStack = new Stack<>();

        numStack.push(arr[0]);
        for (int i = 0; i < op.length; i++) {
            if (op[i] == 2) {
                float a = numStack.pop();
                float b = arr[i + 1];
                numStack.push(a * b);
            } else if (op[i] == 3) {
                float a = numStack.pop();
                float b = arr[i + 1];
                numStack.push(a / b);
            } else if (op[i] == 0 || op[i] == 1) {
                numStack.push(arr[i + 1]);
                opStack.push(op[i]);
            }
        }

        while (!opStack.empty()) {
            float a = numStack.pop();
            float b = numStack.pop();
            int OP = opStack.pop();
            if (OP == 0) {
                numStack.push(a + b);
            } else if (OP == 1) {
                numStack.push(a - b);
            }
        }

        return numStack.pop();
    }
}
