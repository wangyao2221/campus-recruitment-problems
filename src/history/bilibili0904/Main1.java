package history.bilibili0904;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangyao2221
 * @date 2020/9/4 19:42
 */
public class Main1 {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(longestOne(A, 2));
    }

    public static int longestOne(int[] A, int k) {
        int max = 0;
        int left = 0, right = 0;

        int zeroNum = k;
        Queue<Integer> queue = new LinkedList<>();

        while (right < A.length) {
            if (A[right] == 0) {
                queue.add(right);
                if (zeroNum > 0) {
                    zeroNum--;
//                    if (right - left + 1 > max) max = right - left + 1;
                } else {
                    left = queue.poll() + 1;
                }
            }
//            else {
//                if (right - left + 1 > max) max = right - left + 1;
//            }
            if (right - left + 1 > max) max = right - left + 1;
            right++;
        }

        return max;
    }
}
