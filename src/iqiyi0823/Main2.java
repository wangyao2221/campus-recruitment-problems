package iqiyi0823;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/23 15:37
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chs = str.toCharArray();
        HashSet<String> set = new HashSet<>();

        int x = 0, y = 0;
        set.add(x + "," + y);

        for (int i = 0; i < chs.length; i++) {
            int[] tmp = step(x, y, chs[i]);
            x = tmp[0];
            y = tmp[1];
            String key = x + "," + y;
            if (set.contains(key)) {
                System.out.println("True");
                return;
            }
            set.add(key);
        }

        System.out.println("False");
    }

    public static int[] step(int x, int y, char direction) {
        if (direction == 'N') {
            y = y - 1;
        } else if (direction == 'S') {
            y = y + 1;
        } else if (direction == 'E') {
            x = x + 1;
        } else if (direction == 'W') {
            x = x - 1;
        }

        return new int[] {x, y};
    }

    public static int hash(int x, int y) {
        return x * 10001 + y;
    }
}
