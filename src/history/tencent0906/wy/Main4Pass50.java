package history.tencent0906.wy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/6 20:41
 */
public class Main4Pass50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            List<Integer> copyList = new ArrayList<>(list);
            copyList.remove(i);
            Collections.sort(copyList);

            if (n % 2 == 0) {
                System.out.println(copyList.get((n - 1) / 2));
            } else {
                System.out.println((copyList.get(((n - 1) / 2) - 1) + copyList.get((n - 1) / 2)) / 2);
            }
        }
    }
}
