package history.guanglianda0826;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/26 20:43
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        char[] chs1 = line1.toCharArray();
        char[] chs2 = line2.toCharArray();

        int score = 0;

        for (int i = 0; i < chs1.length; i++) {
            if (chs1[i] == chs2[i]) {
                score += 20;
            } else {
                score -= 10;
            }

            if (score < 0) score = 0;
        }

        if (score < 0) {
            System.out.println(0);
        } else {
            System.out.println(score);
        }
    }
}
