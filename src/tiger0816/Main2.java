package tiger0816;

/**
 * @author wangyao2221
 * @date 2020/8/16 16:10
 */
public class Main2 {
    static int m;
    static int n;
    public static void main(String[] args) {
        int[][] arr = {{1,3,1}, {1,5,1}};
        m = arr.length;
        n = arr[0].length;

        int[][] sumMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    sumMatrix[i][j] = arr[i][j];
                } else if (i == 0 && j != 0) {
                    sumMatrix[i][j] = sumMatrix[i][j - 1] + arr[i][j];
                } else if (i != 0 && j == 0) {
                    sumMatrix[i][j] = sumMatrix[i - 1][j] + arr[i][j];
                } else {
                    int up = sumMatrix[i - 1][j];
                    int left = sumMatrix[i][j - 1];
                    sumMatrix[i][j] = (up > left ? left : up) + arr[i][j];
                }
            }
        }

        System.out.println(sumMatrix[m - 1][n - 1]);
    }

    public static int dfs(int[][] arr, int i, int j) {
        System.out.println(i + " " + j);
        int a = arr[i][j];
        int b = arr[i][j];
        if (j + 1 < n) {
            b += dfs(arr, i, j + 1);
        }
        if (i + 1 < m) {
            a += dfs(arr, i + 1, j);
        }
        return a < b ? a : b;
    }
}
