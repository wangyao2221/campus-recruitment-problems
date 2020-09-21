package history.vivo0912;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangyao2221
 * @date 2020/9/12 19:58
 */
public class Main1 {
    private static class Pair {
        int[] point;
        int level;

        public Pair(int[] point, int level) {
            this.point = point;
            this.level = level;
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] start = new int[2];
//        start[0] = sc.nextInt();
//        start[1] = sc.nextInt();
//        int[] target = new int[2];
//        target[0] = sc.nextInt();
//        target[1] = sc.nextInt();
        char[][] matrix = {
                {'+', '#', '+', '+'},
                {'+', '#', '+', '+'},
                {'+', '+', '+', '+'},
                {'+', '#', '+', '+'},
        };
        int[] start = {0,0};
        int[] target = {3,3};

//        char[][] matrix = new char[n][n];
//        for (int i = 0; i < n; i++) {
//            matrix[i] = sc.nextLine().toCharArray();
//        }

        System.out.println(find(matrix, start, target));
    }

    public static int find(char[][] matrix, int[] start, int[] target) {
        int n = matrix.length;
        boolean[][] visited = new boolean[n][n];
        visited[start[0]][start[1]] = true;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(start, 0));

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.point[0] == target[0] && pair.point[1] == target[1]) {
                return pair.level;
            }

            for (int i = 0; i < directions.length; i++) {
                int x = pair.point[0] + directions[i][0];
                int y = pair.point[1] + directions[i][1];
                int level = pair.level;
                if (x >= 0 && y >= 0 && x < n && y < n && matrix[x][y] != '#' && matrix[x][y] != '@' && visited[x][y] == false) {
                    Pair tmp = new Pair(new int[]{x, y}, level + 1);
                    queue.add(tmp);
                    visited[x][y] = true;
                }
            }
        }

        return -1;
    }
}
