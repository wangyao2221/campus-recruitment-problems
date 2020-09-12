package history.zjs0911;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/11 18:30
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print(arr[j][i]);
                } else {
                    System.out.print(" " + arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
