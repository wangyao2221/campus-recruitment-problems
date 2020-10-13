package history.whereWeGo.JYH;

import java.math.BigDecimal;
import java.util.Scanner;

public class qvnawang01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        BigDecimal topNum = BigDecimal.valueOf(1);
        for (int i = m; i >= m - n + 1; i--) {
            topNum = topNum.multiply(BigDecimal.valueOf(i));
        }
        BigDecimal bottomNum = BigDecimal.valueOf(1);
        for (int i = 1; i <= n; i++) {
            bottomNum = bottomNum.multiply(BigDecimal.valueOf(i));
        }
//        System.out.println(topNum);
//        System.out.println(bottomNum);
        BigDecimal rz = topNum.divide(bottomNum);
        System.out.println(rz);
    }
}
