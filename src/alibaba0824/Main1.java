package alibaba0824;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/24 18:58
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int vn = sc.nextInt();
            int en = sc.nextInt();

            int[][] costs = new int[vn][vn];
            int[][] matrix = new int[vn][vn];
            for (int i = 0; i < en; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                int value = sc.nextInt();
                matrix[from][to] = value;
                costs[from][to] = value;
            }

            int times = sc.nextInt();

            for (int i = 0; i < times; i++) {
                int ask = sc.nextInt();
            }
        }
    }

    public static void cost(int[][] costs) {
        Queue<Integer> queue = new LinkedList<>();
        
    }
}
