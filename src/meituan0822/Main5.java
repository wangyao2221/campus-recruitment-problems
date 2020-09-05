package meituan0822;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/22 17:42
 */
public class Main5 {
    static class P {
        int index;
        int value;

        public P(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    static class PComparator implements Comparator<P> {

        @Override
        public int compare(P o1, P o2) {
            return o1.value - o2.value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        P[] ps = new P[x + y];

        for (int i = 0; i < x + y; i++) {
            int value = sc.nextInt();
            ps[i] = new P(i, value);
        }

        Arrays.sort(ps, new PComparator());
        int[] result = new int[x + y];

        for (int i = 0; i < x + y; i++) {
            result[i] = ps[i].index;
        }

        for (int i = 0; i < x + y; i++) {
            if (result[i] < x) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }
        System.out.println();
    }
}
