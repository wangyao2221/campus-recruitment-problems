package history.vm0921.jyh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int m = in.nextInt();
        double step = in.nextDouble();

        resolve(n, m, step);
    }

    private static void resolve(double n, int m, double step) {
        double x = 0;
        double y = 0;
        double tmp = 0;

        double a = 0;
        double b = 0;
        while (m-- > 0) {
            double r = step;
            while (r > 0) {
                if (x < n && y == 0) {
                    tmp = x;
                    x += r;
                    b = x;
                    if (x > n) {
                        x = n;
                        r -= n - tmp;
                    } else {
                        r = 0;
                    }
                }
                if (x == n && y < n) {
                    tmp = y;
                    y += r;
                    b = y;
                    if (y > n) {
                        y = n;
                        r -= n - tmp;
                    } else {
                        r = 0;
                    }
                }
                if (x > 0 && y == n) {
                    tmp = x;
                    x -= r;
                    b = x;
                    if (x < 0) {
                        x = 0;
                        r -= tmp;
                    } else r = 0;
                }
                if (x == 0 && y > 0) {
                    tmp = y;
                    y -= r;
                    b = y;
                    if (y < 0) {
                        y = 0;
                        r -= tmp;
                    } else {
                        r = 0;
                    }
                }
            }
            System.out.printf("%.2f %.2f\n", x, y);
        }
    }
}
