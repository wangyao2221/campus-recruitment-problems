package alibaba0819;

import java.util.Arrays;

/**
 * @author wangyao2221
 * @date 2020/8/19 08:32
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = fun(new int[]{2, 2, 2, 2, 2});
//        int[] result = fun(new int[]{5, 1, 1, 1, 1});
        System.out.println(Arrays.toString(result));
    }

    public static int[] fun(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int[] tmp = new int[len];

        int flag = 1;
        int first = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] != first) flag = 0;
            tmp[i] = arr[i];
            if (tmp[i] > result[0]) {
                result[0] = tmp[i];
            }
        }

        if (flag == 1) {
            Arrays.fill(result, first);
            return result;
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tmp[j] > tmp[j + 1]) tmp[j] = tmp[j + 1];
                if (tmp[j] > result[len - i]) result[len - i] = tmp[j];
            }
        }

        return result;
    }
}
