package history.guanglianda0826;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/8/26 21:26
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long[] arr = new long[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }

        long result = fun(sum, arr);
        System.out.println(result);
    }

    private static long fun(long sum, long[] arr) {
        Arrays.sort(arr);

        long left = 1;
        long right = sum / 4;
        long result = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long need = 0;
            long left_ = 0;
            for (int i = 0; i < 4; i++) {
                if (arr[i] < mid) {
                    need += mid - arr[i];
                } else if (arr[i] > mid) {
                    left_ += arr[i] - mid;
                }
            }

            if (need * 2 <= left_) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result * 4;
    }
}
