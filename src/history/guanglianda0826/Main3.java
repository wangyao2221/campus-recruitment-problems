package history.guanglianda0826;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangyao2221
 * @date 2020/8/26 21:57
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fun_(arr));
    }

    public static int fun_(Integer[] arr) {
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -1;
//            }
//        });

        int sum = 0;
        Integer[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);

        int j = 0;
        for (int i = 0; i < arrCopy.length; i++) {
            if (arr[i] == arrCopy[j]) {
                j++;
            } else {
                sum++;
            }
        }

        return sum;
    }

    public static int fun(int[] arr) {
        if (arr.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > stack.peek()) {
                stack.push(arr[i]);
            } else {
                result++;
            }
        }

        return result;
    }
}
