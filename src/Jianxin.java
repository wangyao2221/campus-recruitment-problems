/**
 * @author wangyao2221
 * @date 2020/10/10 19:37
 */
public class Jianxin {
    public static boolean[] visited;
    public static int count = 0;

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        System.out.println(find(matrix));
    }

    public static int find(int[][] matrix) {
        int n = matrix.length;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(matrix, i);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int[][] matrix, int start) {
        visited[start] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (i != start && !visited[i] && matrix[start][i] == 1) {
                dfs(matrix, i);
            }
        }
    }
}
