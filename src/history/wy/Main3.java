package history.wy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/10 19:27
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        int pre = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pre = sc.nextInt();
                count++;
            } else {
                int tmp = sc.nextInt();
                if (tmp != pre) {
                    list.add(count);
                    count = 1;
                } else {
                    count++;
                }
                pre = tmp;
            }
        }
        list.add(count);

        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i) < list.get(i + 1) ? list.get(i) : list.get(i + 1);
            if (min > max) max = min;
        }

        System.out.println(2 * max);
    }
}
