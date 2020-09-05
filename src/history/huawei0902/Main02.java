package history.huawei0902;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangyao2221
 * @date 2020/9/2 19:05
 */
public class Main02 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'S', 'S', 'H', 'H', 'H'},
                {'S', 'S', 'H', 'H', 'H'},
                {'H', 'H', 'S', 'H', 'H'},
                {'H', 'H', 'H', 'S', 'S'},
        };

        System.out.println(fun(matrix));
    }

    public static int fun(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;

        int count = 0;
        boolean[][] visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 'S') {
                    bfs(matrix, visit, new Integer[]{i, j});
                    count++;
                }
            }
        }

        return count;
    }

    public static void bfs(char[][] grid, boolean[][] visit, Integer[] start) {
        int m = grid.length, n = grid[0].length;

        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        queue.add(start);

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            Integer[] loc = queue.poll();
            for (int i = 0; i < directions.length; i++) {
                int x = loc[0] + directions[i][0];
                int y = loc[1] + directions[i][1];
                if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 'S') {
                    queue.add(new Integer[]{x, y});
                    grid[x][y] = 'H';
                }
            }
//            if (loc[0] - 1 >= 0 && grid[loc[0] - 1][loc[1]] == 'S' && !visit[loc[0] - 1][loc[1]]) {
//                queue.add(new Integer[]{loc[0] - 1, loc[1]});
//            }
//            if (loc[0] + 1 < m && grid[loc[0] + 1][loc[1]] == 'S' && !visit[loc[0] + 1][loc[1]]) {
//                queue.add(new Integer[]{loc[0] + 1, loc[1]});
//            }
//            if (loc[1] - 1 >= 0 && grid[loc[0]][loc[1] - 1] == 'S' && !visit[loc[0]][loc[1] - 1]) {
//                queue.add(new Integer[]{loc[0], loc[1] - 1});
//            }
//            if (loc[1] + 1 < n && grid[loc[0]][loc[1] + 1] == 'S' && !visit[loc[0]][loc[1] + 1]) {
//                queue.add(new Integer[]{loc[0], loc[1] + 1});
//            }
        }
    }
}
