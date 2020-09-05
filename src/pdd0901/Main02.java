package pdd0901;

/**
 * @author wangyao2221
 * @date 2020/9/1 19:19
 */
public class Main02 {
    static int tmpSum = 0;
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 1},
                {1, 0, 1, 1},
                {0, 1, 0, 0}
        };

        int max = fun(matrix);

        System.out.println(max);
    }

    private static int fun(int[][] matrix) {
        int m = matrix.length;
        int n = 0;
        if (m > 0) {
            n = matrix[0].length;
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) count++;
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    int[][] visited = new int[m][n];
                    matrix[i][j] = 1;
                    tmpSum = 0;
                    dfs(matrix, i, j, visited);
                    if (tmpSum > count) {
                        System.out.println(count);
                        return count;
                    } else if (tmpSum <= count) {
                        if (tmpSum > max)  max = tmpSum;
                    }
                    matrix[i][j] = 0;
                }
            }
        }
        return max;
    }

    public static void dfs(int[][] matrix, int i, int j, int[][] visited) {
        int m = matrix.length;
        int n = matrix[0].length;
        visited[i][j] = 1;
        tmpSum++;

        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int k = 0; k < direction.length; k++) {
            int x = i + direction[k][0];
            int y = j + direction[k][1];
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] == 1 && visited[x][y] == 0) {
                dfs(matrix, x, y, visited);
            }
        }
    }
}
