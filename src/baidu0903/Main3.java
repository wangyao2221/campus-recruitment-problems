package baidu0903;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/3 20:01
 */
public class Main3 {
    public static int[] book;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        book = new int[n + 1];
//        System.out.println(climb(n, m, -1 ,-1));
        HashMap<String, String> map = new HashMap<>();
        map.put("abc", "aaa");
        System.out.println(map.get(new String("abc")));
    }

    public static int climb(int n, int m, int prePre, int pre) {
        if (n == 0) {
            return 1;
        }

        int sum = 0;

        if (n >= m) {
            for (int i = 1; i <= m; i++) {
                if (i != prePre && i != pre)
                    sum += climb(n - i, m, pre, i);
            }
        } else {
            sum = climb(n, n, prePre, pre);
        }

        return sum;
    }
}
