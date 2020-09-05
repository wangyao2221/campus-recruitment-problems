package shopee0819;

import java.util.*;


public class Main3 {
    public static void main(String[] args) {
        System.out.println(calEncodeNumber(8));
    }

    public static int count = 0;

    /**
     * calculate correct encode number
     *
     * @param length int整型 encode string length
     * @return int整型
     */
    public static int calEncodeNumber(int length) {
        // write code here
        int[] arr = new int[length];
        arr[0] = 1;
        dfs(arr, length,1);
        return count;
    }

    public static void dfs(int[] arr, int length, int start) {
        if (start == length) {
            if (check(arr)) {
                count++;
                return;
            } else {
                return;
            }
        }

        arr[start] = 1;
        dfs(arr, length, start + 1);
        arr[start] = 0;
        dfs(arr, length, start + 1);
    }

    public static boolean check(int[] encode) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = encode.length - 1; i >= 1; i--) {
            if (encode[i] == 1) {
                indexes.add(i + 1);
            } else {
                for (int j = 0; j < indexes.size(); j++) {
                    if (indexes.get(j) % (i + 1) == 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}