package history.huawei0819;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/19 18:58
 */
public class Main2 {
    public static HashMap<Integer, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, value + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(getnum(n));
    }

    public static long getnum(int n) {
        long num = 0;
        long lastLevel = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(i)) {
                break;
            }
            if (i == 0) {
                num = map.get(0);
                lastLevel = num;
            } else {
                lastLevel = c(2 * map.get(i - 1), map.get(i));
                num *= lastLevel;
            }
        }

        return num % ((int) Math.pow(10, 9) + 7);
    }

    public static long c(int n, int m) {
        if (m < n - m) m = n- m;
        long result = 1;
        for (int i = m + 1; i <= n; i++) {
            result *= i;
        }
        for (int i = 1; i <= n - m; i++) {
            result /= i;
        }
        return result;
    }
}
