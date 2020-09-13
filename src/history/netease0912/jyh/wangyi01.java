package history.netease0912.jyh;

import java.util.Arrays;
import java.util.Scanner;

public class wangyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chs = sc.nextLine().toCharArray();
        int result = fun(chs);
        System.out.println(result);
    }

    private static int fun(char[] chs) {
        int[] arr = new int[1 << 6];
        Arrays.fill(arr, -1);
        int result = 0;
        int bit = 0;
        arr[0] = 0;

        for (int i = 0; i < chs.length; i++) {
            char tmp = chs[i];

            if (tmp == 'a') bit ^= (1 << 0);
            else if (tmp == 'b') bit ^= (1 << 1);
            else if (tmp == 'c') bit ^= (1 << 2);
            else if (tmp == 'x') bit ^= (1 << 3);
            else if (tmp == 'y') bit ^= (1 << 4);
            else if (tmp == 'z') bit ^= (1 << 5);

            if (arr[bit] >= 0) result = result > i + 1 - arr[bit] ? result : i + 1 - arr[bit];
            else arr[bit] = i + 1;
        }
        return result;
    }
}
