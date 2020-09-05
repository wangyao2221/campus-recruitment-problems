package history.huawei0819;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/19 18:58
 */
public class Main1 {
    public static int count = 0;
    public static StringBuilder rz = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m < 10 || n < 10 || m > 1000 || n > 1000) return;

        rz.append("[");
        int[][] arr = new int[m][n];
        spiralOrder(arr);
        String out = rz.substring(0, rz.length() - 1) + "]";
        System.out.println(out);
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int[] result = new int[matrix.length * matrix[0].length];
        for (int i = 0, in = 0; i < (matrix.length + 1) / 2; i++) {
            in = printCircle(matrix, i, result, in);
        }
        return result;
    }

    public static int printCircle(int[][] matrix, int start, int[] result, int in) {
        int height = matrix.length - start * 2;
        int width = matrix[0].length - start * 2;

        if (height < 1 || width < 1) {
            return in;
        }

        int row = start;
        int col = start - 1;

        for (int i = 0; i < width; i++) {
            in++;
            col++;
            count++;

            if (count % 10 == 7) {
                if (((count / 10) % 10 & 1) == 1) {
                    rz.append("[" + row + "," + col + "]" + ",");
                }
            }
        }

        if (height > 1) {
            for (int i = 1; i < height; i++) {
                in++;
                row++;
                count++;

                if (count % 10 == 7) {
                    if (((count / 10) % 10 & 1) == 1) {
                        rz.append("[" + row + "," + col + "]" + ",");
                    }
                }
            }
        }

        if (height > 1 && width > 1) {
            for (int i = 1; i < width; i++) {
                in++;
                col--;
                count++;
                if (count % 10 == 7) {
                    if (((count / 10) % 10 & 1) == 1) {
                        rz.append("[" + row + "," + col + "]" + ",");
                    }
                }
            }
        }

        if (height > 2 && width > 1) {
            for (int i = 2; i < height; i++) {
                in++;
                row--;
                count++;
                if (count % 10 == 7) {
                    if (((count / 10) % 10 & 1) == 1) {
                        rz.append("[" + row + "," + col + "]" + ",");
                    }
                }
            }
        }

        return in;
    }
}
