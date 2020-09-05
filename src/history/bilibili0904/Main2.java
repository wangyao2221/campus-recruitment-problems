package history.bilibili0904;

import java.util.ArrayList;

/**
 * @author wangyao2221
 * @date 2020/9/4 19:24
 */
public class Main2 {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        printMatrix(matrix);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;

        int colStart = 0, colEnd = n - 1;
        int rowStart = 0, rowEnd = m - 1;
        while (colStart <= colEnd && rowStart <= rowEnd) {
            print(matrix, colStart, colEnd, rowStart, rowEnd);
            colStart++;
            colEnd--;
            rowStart++;
            rowEnd--;
        }

        return list;
    }

    public static void print(int[][] matrix, int colStart, int colEnd, int rowStart, int rowEnd) {
        for (int i = colStart; i <= colEnd; i++) {
            list.add(matrix[rowStart][i]);
        }
        for (int i = rowStart + 1; i <= rowEnd; i++) {
            list.add(matrix[i][colEnd]);
        }
        // 注意一行或一列的情况，下面两个循环需要加rowEnd != rowStart colEnd != colStart
        for (int i = colEnd - 1; i >= colStart && rowEnd != rowStart; i--) {
            list.add(matrix[rowEnd][i]);
        }
        for (int i = rowEnd - 1; i >= rowStart + 1 && colEnd != colStart; i--) {
            list.add(matrix[i][colStart]);
        }
    }
}
