import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/27 19:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int left = find(arr, n - 0.5f);
        int right = find(arr, n + 0.5f);

        if (arr[left] != n) {
            System.out.println(-1 + " " + -1);
        } else {
            if (arr[right] != n) {
                right = right - 1;
            }
            System.out.println(left + " " + right);
        }
    }

    public static int find(int[] arr, float target) {
        int low = 0, high = arr.length - 1;

        int middle = 0;
        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] < target) {
                low = middle + 1;
            } else if (arr[middle] > target) {
                high = middle - 1;
            }
        }

        return middle;
    }
}
