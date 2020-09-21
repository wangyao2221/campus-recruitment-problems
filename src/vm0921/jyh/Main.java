package vm0921.jyh;

import javafx.beans.binding.DoubleExpression;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int m = in.nextInt();
        double workLen = in.nextDouble();
        double x = 0;
        double y = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        double tmp = 0;
        while (m-- > 0){
            double r = workLen;
//            int times = (int) ((int)r / (4 * n));
//            r = r - times*n*4;
            while (r > 0) {
                if (x < n && y == 0) {
                    tmp = x;
                    x += r;
                    if (x > n) {
                        x = n;
                        r -= n - tmp;
                    }
                    else r = 0;
                }
                if (x == n && y < n) {
                    tmp = y;
                    y += r;
                    if (y > n) {
                        y = n;
                        r -= n - tmp;
                    }
                    else r = 0;
                }
                if (x > 0 && y == n) {
                    tmp = x;
                    x -= r;
                    if (x < 0) {
                        x = 0;
                        r -= tmp - 0;
                    }
                    else r = 0;
                }
                if (x == 0 && y > 0) {
                    tmp = y;
                    y -= r;
                    if (y < 0) {
                        y = 0;
                        r -= tmp - 0;
                    }
                    else r = 0;
                }
            }
            System.out.println(df.format(x)+" "+df.format(y));
        }
    }
}
