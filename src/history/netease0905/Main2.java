package history.netease0905;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/5 14:55
 */
public class Main2 {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            char[][] matrix = new char[h][w];
            for (int i = 0; i < h; i++) {
                String line = sc.next();
                for (int j = 0; j < w; j++) {
                    matrix[i] = line.toCharArray();
                }
            }

            int w_ = sc.nextInt();
            int h_ = sc.nextInt();

            char[][] target = new char[h_ + h][w_ + w];

            for (int i = 0; i < h + h_; i++) {
                Arrays.fill(target[i], '.');
            }

            for (int i = h; i < h_ + h; i++) {
                String line = sc.next();
                char[] chs = line.toCharArray();
                for (int j = w, jj = 0; j < w_ + w; j++, jj++) {
                    target[i][j] = chs[jj];
                }
            }

            int initX = sc.nextInt();
            int initY = sc.nextInt();
            int stepX = sc.nextInt();
            int stepY = sc.nextInt();

            int x = initX + h_ / 2;
            int y = initY + w_ / 2;

            step(matrix, target, x, y);
//            System.loadLibrary("clear");
            Thread.sleep(1000);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            print(matrix);

            int th = target.length;
            int tw = target[0].length;

            for (int i = x + stepX, j = y + stepY; i < th && j < tw; i += stepX, j += stepY) {
                step(matrix, target, i, j);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                print(matrix);
                Thread.sleep(1000);
            }

            System.out.println(count);
        }
    }

    public static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void step(char[][] matrix, char[][] target, int x, int y) {
        int mh = matrix.length;
        int mw = matrix[0].length;
        int th = target.length - 1;
        int tw = target[0].length - 1;

        for (int i = x, ii = th; i >= 0 && th >= 0; i--, ii--) {
            if (i >= mh) continue;

            for (int j = y, jj = tw; j >= 0 && tw >= 0; j--, jj--) {
                if (j >= mw) continue;
                if (matrix[i][j] != target[ii][jj]) {
                    matrix[i][j] = target[ii][jj];
                    count++;
                }
            }
        }
    }
}
